import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/input.txt");
        Scanner sc = new Scanner(file);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
