package binarysearch.p14425;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/main/java/binarysearch/p14425/input.txt"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }

        int result = 0;
        Arrays.sort(S);

        // binary search
        for (int i = 0; i < M; i++) {
            String str = sc.next();
            result += binary_search(S, str);
        }

        System.out.println(result);
    }

    private static int binary_search(String[] S, String findStr) {
        int start = 0;
        int end = S.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (S[middle].equals(findStr)) {
                return 1;
            }
            if (S[middle].compareTo(findStr) < 0) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return 0;
    }
}