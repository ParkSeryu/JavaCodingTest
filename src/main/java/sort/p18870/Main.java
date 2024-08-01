package sort.p18870;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/main/java/p18870/input.txt"));
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }

        Set<Integer> set = new TreeSet<>(list);

        Map<Integer, Integer> integerMap = new HashMap<>();
        int index = 0;
        for (Integer i : set) {
            integerMap.put(i, index);
            index++;
        }

        StringBuffer sb = new StringBuffer();
        for (Integer i : list) {
            sb.append(integerMap.get(i)).append(" ");
        }
        System.out.print(sb.toString());

    }
}
