package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public int solution(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/main/java/sample/input.txt"));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Main main = new Main();
        System.out.println(main.solution(a, b));
    }
}
