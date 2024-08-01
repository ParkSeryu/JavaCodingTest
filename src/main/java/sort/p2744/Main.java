package sort.p2744;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'a'){
                answer += (char) (str.charAt(i) - 32);
            }else{
                answer += (char) (str.charAt(i) + 32);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/main/java/p2744/input.txt"));
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        System.out.println(main.solution(sc.nextLine()));
    }
}
