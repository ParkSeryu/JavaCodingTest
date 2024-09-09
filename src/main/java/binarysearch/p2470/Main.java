package binarysearch.p2470;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/main/java/binarysearch/p2470/input.txt"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int a = 0;
        int b = 0;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                int abs = Math.abs(arr[i] + arr[j]);
                if (result > abs) {
                    result = abs;
                    a = arr[i];
                    b = arr[j];
                }
            }
        }

        int c = 0;
        int d = 0;
        c = Math.min(a, b);
        d = Math.max(a, b);
        System.out.println(c);
        System.out.println(d);
    }

    private static boolean binary_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle] == target) {
                return true;
            }
            if (arr[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return false;
    }
}