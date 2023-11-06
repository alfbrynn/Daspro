import java.util.Scanner;
public class NestedLoopForeach19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris = 5;
        int kolom = 7;
        double[][] temps = new double[baris][kolom];
        
        for (int i = 0; i < baris; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < kolom; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < baris; i++) {
            System.out.print("Kota ke-" + i + ": ");
            for (double suhu : temps[i]) {
                System.out.print(suhu + " ");
            }
            System.out.println();
        }
    }
}
