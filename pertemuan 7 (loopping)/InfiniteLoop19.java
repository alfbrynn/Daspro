import java.util.Scanner;
public class InfiniteLoop19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hitung = 1;
        while (hitung <= 25) {
            System.out.println(hitung);
            hitung = hitung - 1;
        }
    }
}