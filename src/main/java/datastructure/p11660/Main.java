package datastructure.p11660;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N + 1][N + 1];
        int[][] D = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j];
            }
        }

        for(int i = 0; i < M; i++){
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();

            int result = D[X2][Y2] - D[X1 - 1][Y2] - D[X2][Y1 - 1] + D[X1 - 1][Y1 - 1];
            System.out.println(result);
        }


    }
}
