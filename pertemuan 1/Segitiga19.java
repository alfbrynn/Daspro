import java.util.Scanner;

public class Segitiga19 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan panjang alas: ");
        double alas = input.nextDouble();
        
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        // Proses
        double luas = 0.5 * alas * tinggi;

        // Output
        System.out.println("Luas segitiga adalah: " + luas);

        input.close();
    }
}