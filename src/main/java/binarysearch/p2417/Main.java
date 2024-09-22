package binarysearch.p2417;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("src/main/java/binarysearch/p2417/input.txt"));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            long N = Long.parseLong(br.readLine().trim());
            long result = parametric_search(N);
            bw.write(result + "\n");
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long parametric_search(long su) {
        long start = 0;
        long end = Long.MAX_VALUE;
        long result = 0;

        while (start <= end) {
            long middle = (start + end) / 2;
            if (Math.pow(middle, 2) >= su) {
                end = middle - 1;
                result = middle;
            } else {
                start = middle + 1;
            }
        }
        return result;
    }
}