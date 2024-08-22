package prefixsum.p11660;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/main/java/prefixsum/p11660/input.txt"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int result = 0;

        int[][] arr = new int[N + 1][N + 1];
        int[][] prefixSumArr = new int[N + 1][N + 1];

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        System.out.println(Arrays.deepToString(arr));


//        prefixSumArr[0] = arr[0];
//
//        for (int i = 1; i <= N; i++) {
//            prefixSumArr[i] = prefixSumArr[i - 1] ^ arr[i];
//        }
//
//        for (int n = 0; n < Q; n++) {
//            int S = sc.nextInt();
//            int E = sc.nextInt();
//            result ^= prefixSumArr[E] ^ prefixSumArr[S - 1];
//        }

        System.out.println(result);

    }
}