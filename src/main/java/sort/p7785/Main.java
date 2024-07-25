package sort.p7785;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public String[] solution(String[] list) {
        Set<String> logSet = new HashSet<>();
        List<String> logList = new ArrayList<>();

        for (String s : list) {
            String[] split = s.split(" ");
            String compareStr = split[0];
            if (logSet.contains(compareStr)) {
                logSet.remove(compareStr);
                continue;
            }
            logSet.add(compareStr);
        }

        int length = logSet.size();
        logList = new ArrayList<>(logSet);
        logList.sort(Collections.reverseOrder());

        return logList.toArray(new String[length]);
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/main/java/sort/p7785/input.txt"));
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String[] list = new String[num];

        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextLine();
        }

        Main main = new Main();
        String[] solution = main.solution(list);
        for (String s : solution) {
            System.out.println(s);
        }
    }
}
