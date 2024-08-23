package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static int solution(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/main/java/sample/input.txt"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Integer a = 1;
        Integer b = 2;

        if(a.equals(b)){

        }

        int T = sc.nextInt();
        int P = sc.nextInt();

        int answer_T = 0;
        for (int i : arr) {
            answer_T += (int) Math.ceil((double) i / T);
        }


        System.out.println(answer_T);
        System.out.print(N / P + " ");
        System.out.print(N % P);

    }
}
