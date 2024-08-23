package prefixsum.p11660;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/main/java/prefixsum/p11660/input.txt"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N + 1][N + 1];
        int[][] prefixSumArr = new int[N + 1][N + 1];

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                prefixSumArr[i][j] =
                        prefixSumArr[i - 1][j] + prefixSumArr[i][j - 1] - prefixSumArr[i - 1][j - 1] + arr[i][j];
            }
        }

        while (M-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int result = prefixSumArr[x2][y2] - prefixSumArr[x1 - 1][y2] - prefixSumArr[x2][y1 - 1] + prefixSumArr[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}