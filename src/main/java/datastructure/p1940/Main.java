package datastructure.p1940;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());

        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int result = 0;
        int start = 0;
        int end = N - 1;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        while(start < end){
            int sum = arr[start] + arr[end];
            if(sum == M){
                result++;
                end--;
            }
            else if(sum > M){
                end--;
            }
            else {
                start++;
            }
        }


        System.out.println(result);
        bf.close();
    }
}
