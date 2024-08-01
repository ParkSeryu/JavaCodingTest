package p11723;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
//        System.setIn(new FileInputStream("src/main/java/p11723/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> s = new ArrayList<>();

        int M = Integer.parseInt(br.readLine());
        Main main = new Main();
        int num = 0;

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            String[] split = str.split(" ");
            String cmd = split[0];
            if (split.length > 1) {
                num = Integer.parseInt(split[1]);
            }
            switch (cmd) {
                case "add":
                    main.add(s, num);
                    break;
                case "remove":
                    main.remove(s, num);
                    break;
                case "check":
                    bw.write(main.check(s, num) + "\n");
                    break;
                case "toggle":
                    main.toggle(s, num, main);
                    break;
                case "all":
                    main.all(s);
                    break;
                case "empty":
                    s.clear();
            }
        }
        bw.flush();
        bw.close();
    }

    private void all(List<Integer> s) {
        s.clear();
        for (int i = 1; i <= 20; i++) {
            s.add(i);
        }
    }

    private void toggle(List<Integer> s, int num, Main main) {
        if (s.contains(num)) {
            main.remove(s, num);
        } else {
            main.add(s, num);
        }

    }

    private void remove(List<Integer> s, int num) {
        s.remove(Integer.valueOf(num));
    }

    private int check(List<Integer> s, Integer num) {
        if (s.contains(num)) {
            return 1;
        }
        return 0;
    }

    private void add(List<Integer> s, int num) {
        if (!s.contains(num)) {
            s.add(num);
        }
    }
}
