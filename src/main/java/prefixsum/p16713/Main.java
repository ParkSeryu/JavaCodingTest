package prefixsum.p16713;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/main/java/prefixsum/p16713/input.txt"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int result = 0;

        int[] arr = new int[N + 1];
        int[] prefixSumArr = new int[N + 1];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        prefixSumArr[0] = arr[0];

        for (int i = 1; i <= N; i++) {
            prefixSumArr[i] = prefixSumArr[i - 1] ^ arr[i];
        }

        for (int n = 0; n < Q; n++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            result ^= prefixSumArr[E] ^ prefixSumArr[S - 1];
        }

        System.out.println(result);

    }
}