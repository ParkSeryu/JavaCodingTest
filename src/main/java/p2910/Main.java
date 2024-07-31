package p2910;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void solution(List<Integer> inputList) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (Integer i : inputList) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        for (Integer in : keySet) {
            for(int i = 0; i < map.get(in); i++){
                System.out.print(in + " ");
            }
        }


    }

    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/main/java/p2910/input.txt"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        List<Integer> integerList = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            integerList.add(sc.nextInt());
        }
        solution(integerList);
    }
}
