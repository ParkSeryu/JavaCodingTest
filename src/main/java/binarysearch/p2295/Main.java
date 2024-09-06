package binarysearch.p2295;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/main/java/binarysearch/p2295/input.txt"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] U = new int[N];

        for (int i = 0; i < N; i++) {
            U[i] = sc.nextInt();
        }

        Set<Integer> sumSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                sumSet.add(U[i] + U[j]);
            }
        }

        int result = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int target = U[i] - U[j];
                if (sumSet.contains(target)) {
                    result = Math.max(result, U[i]);
                }
            }
        }

        System.out.println(result);
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