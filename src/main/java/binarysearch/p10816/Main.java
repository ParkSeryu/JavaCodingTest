package binarysearch.p10816;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/binarysearch/p10816/input.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] card = new int[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(input[i]);
        }

        int M = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");
        int[] answer = new int[M];
        for (int i = 0; i < M; i++) {
            answer[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(card);

        for (int i = 0; i < answer.length; i++) {
            int lowerBound = binarySearchLower(card, answer[i]);
            int upperBound = binarySearchUpper(card, answer[i]);
            bw.write(upperBound - lowerBound + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static int binarySearchLower(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = arr.length;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (target > arr[middle]) {
                start = middle + 1;
                result = middle;
            } else {
                end = middle - 1;
            }
        }

        if(result + 1 > arr.length){
            result = 0;
        }else{
            result++;
        }

        return result;
    }

    static int binarySearchUpper(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int result = arr.length;

        while(start <= end) {
            int middle = (start + end) / 2;

            if (target >= arr[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
                result = middle;
            }
        }

        return result;
    }
}