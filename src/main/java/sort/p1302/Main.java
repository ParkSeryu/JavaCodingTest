package sort.p1302;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static String solution(List<String> inputList) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : inputList) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        return keySet.get(0);
    }

    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/main/java/p1302/input.txt"));
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            strList.add(sc.next());
        }
        System.out.println(solution(strList));
    }
}
