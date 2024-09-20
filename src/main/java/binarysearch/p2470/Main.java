package binarysearch.p2470;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/main/java/binarysearch/p2470/input.txt"));
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int result = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;

        for (int i = 0; i < N; i++) {
            int[] intArray = binary_search(arr, i, arr[i]);
            int value = intArray[2];
            if (result > value) {
                result = value;
                a = intArray[0];
                b = intArray[1];
            }
        }
        sb.append(a);
        sb.append(" ");
        sb.append(b);
        System.out.println(sb.toString());
    }

    private static int[] binary_search(int[] arr, int targetIndex, int target) {
        int start = targetIndex + 1;
        int end = arr.length - 1;
        int result = Integer.MAX_VALUE;
        int[] returnArray = new int[3];

        while (start <= end) {
            int middle = (start + end) / 2;
            int value = Math.abs(arr[middle] + target);
            returnArray[0] = Math.min(arr[middle], targetIndex);
            returnArray[1] = Math.max(arr[middle], targetIndex);

            if (result > value) {
                result = value;
                returnArray[2] = result;
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return returnArray;
    }
}