package datastructure.p2018;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 1;
        int result = 1;

        int start = 1;
        int end = 1;

        while(start < N){
            if(sum < N){
                end++;
                sum += end;
            }
            else if (sum > N){
                sum -= start;
                start++;
            }
            else{
                end++;
                sum += end;
                result++;
            }
        }

        System.out.println(result);
    }
}
