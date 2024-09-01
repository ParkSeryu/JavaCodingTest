package binarysearch.p1920;

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
        System.setIn(new FileInputStream("src/main/java/binarysearch/p1920/input.txt"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        // binary search
        for (int i : B) {
            System.out.println(binary_search(A, i));
        }
    }

    private static int binary_search(int[] A, int find_su) {
        int start = 0;
        int end = A.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (A[middle] == find_su) {
                return 1;
            }
            if (A[middle] > find_su) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return 0;
    }
}