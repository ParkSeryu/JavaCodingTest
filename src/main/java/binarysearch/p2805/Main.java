package binarysearch.p2805;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextInt();
        int[] trees = new int[N];

        for (int i = 0; i < trees.length; i++) {
            trees[i] = sc.nextInt();
        }

        System.out.println(parametric_search(M, trees));
    }

    private static long parametric_search(long height, int[] trees) {
        long start = 0;
        long end = Long.MAX_VALUE;
        long result = 0;

        while (start <= end) {
            long middle = (start + end) / 2;
            if (getHeight(middle, trees) < height) {
                end = middle - 1;
            } else {
                start = middle + 1;
                result = middle;
            }
        }
        return result;
    }

    private static long getHeight(long height, int[] trees) {
        long result = 0;
        for (int tree : trees) {
            long h = tree - height;
            if (h > 0) {
                result += h;
            }
        }
        return result;
    }
}