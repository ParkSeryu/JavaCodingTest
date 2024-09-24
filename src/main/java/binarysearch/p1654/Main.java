package binarysearch.p1654;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/main/java/binarysearch/p1654/input.txt"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        long[] cables = new long[N];
        for (int i = 0; i < cables.length; i++) {
            cables[i] = sc.nextLong();
        }

        System.out.println(parameteric_search(K, cables));
    }

    private static long parameteric_search(int K, long[] cables) {
        long start = 0;
        long end = Long.MAX_VALUE;
        long result = -1;

        while (start <= end) {
            long middle = (start + end) / 2;
            if (isLongestLength(K, cables, middle)) {
                result = middle;
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return result;
    }

    private static boolean isLongestLength(int K, long[] cables, long middle) {
        long result = 0;
        for (long cable : cables) {
            long k = cable / middle;
            result += k;
        }
        return result >= K;
    }
}