package datastructure.p11720;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        int result = 0;

        for (int i = 0; i < sNum.length(); i++) {
            result += sNum.charAt(i) - '0';
        }

        System.out.println(result);
    }
}
