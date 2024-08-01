package sort.p1931;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int solution(int[][] arr) {
        extracted(arr);
        int cnt = 1;
        int end_time = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if (end_time <= arr[i][0]) {
                cnt++;
                end_time = arr[i][1];
            }
        }
        return cnt;
    }

    private static void extracted(int[][] arr) {
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
    }

    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/main/java/sort/p1931/input.txt"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int answer = Main.solution(arr);
        System.out.println(answer);
    }
}
