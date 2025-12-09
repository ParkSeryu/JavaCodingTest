package datastructure.p12891;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int S = sc.nextInt();
        int result = 0;

        String DNA = sc.next();
        char[] ch = DNA.toCharArray();

        int cntA = sc.nextInt();
        int cntC = sc.nextInt();
        int cntG = sc.nextInt();
        int cntT = sc.nextInt();

        int resultA = 0;
        int resultC = 0;
        int resultG = 0;
        int resultT = 0;

        for(int i = P; i < S; i++){
            int j = i - P;

        }

        System.out.println(result);
    }
}
