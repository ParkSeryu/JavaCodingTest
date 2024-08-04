package sort.p1431;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

class Guitar {
    String serialNumber;
    int length;
    int sum;

    public Guitar(String str) {
        this.length = str.length();
        this.serialNumber = str;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Integer.parseInt(String.valueOf(ch));
            }
        }
    }
}


public class Main {

    public static void solution(Guitar[] guitarList) {
        Arrays.sort(guitarList, new Comparator<Guitar>() {
            @Override
            public int compare(Guitar o1, Guitar o2) {
                if (o1.length != o2.length) {
                    return o1.length - o2.length;
                }
                if (o1.sum != o2.sum) {
                    return o1.sum - o2.sum;
                }
                return o1.serialNumber.compareTo(o2.serialNumber);
            }
        });
        for (Guitar guitar : guitarList) {
            System.out.println(guitar.serialNumber);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/main/java/sort/p1431/input.txt"));
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Guitar[] guitarList = new Guitar[num];
        for (int i = 0; i < num; i++) {
            guitarList[i] = new Guitar(sc.next());
        }
        solution(guitarList);
    }
}
