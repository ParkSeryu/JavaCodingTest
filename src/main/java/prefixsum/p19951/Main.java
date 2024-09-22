package prefixsum.p19951;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/main/java/prefixsum/p19951/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        int[] arr = new int[N + 1];
        int[] prefixSumArr = new int[N + 2];

        String[] arrLine = br.readLine().split(" ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(arrLine[i - 1]);
        }

        prefixSumArr[0] = arr[0];

        for (int i = 0; i < M; i++) {
            String[] operation = br.readLine().split(" ");
            int a = Integer.parseInt(operation[0]);
            int b = Integer.parseInt(operation[1]);
            int k = Integer.parseInt(operation[2]);
            prefixSumArr[a] += k;
            prefixSumArr[b + 1] -= k;
        }
        System.out.println(Arrays.toString(prefixSumArr));

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            cnt += prefixSumArr[i];
            arr[i] += cnt;
            if (i == N) {
                bw.write(arr[i] + "");
            } else {
                bw.write(arr[i] + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}