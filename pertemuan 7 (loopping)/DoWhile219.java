import java.util.Scanner;
public class DoWhile219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 10;
        do {
            System.out.println(x);
        } while (++x <= 8);
        System.out.println("Program berhenti");
    }
}