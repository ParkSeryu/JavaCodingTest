package datastructure.p1546;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m = 0;

        List<Integer> list = new ArrayList();

        for(int i = 0; i < N; i++){
            int nextInt = sc.nextInt();
            if(nextInt > m){
                m = nextInt;
            }
            list.add(nextInt);
        }

        double sum = 0;
        for(int i = 0; i < list.size() ; i++){
            sum += list.get(i);
        }
        double result = sum * 100 / m / N;

        System.out.println(result);
    }
}
