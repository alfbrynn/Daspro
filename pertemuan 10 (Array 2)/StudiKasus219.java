import java.util.Scanner;

public class StudiKasus219 {
    public static void main(String[] args) {
        double[][] suhuKota = new double[5][7];
        
        // Daftar nama kota
        String[] kota = {"Tokyo", "Osaka", "Sapporo", "Fukuoka", "Naha"};
        
        Scanner scanner = new Scanner(System.in);
        
        // Loop untuk mengumpulkan data suhu
        for (int i = 0; i < 5; i++) {
            System.out.println("Kota: " + kota[i]);
            for (int j = 0; j < 7; j++) { 
                System.out.print("Masukkan suhu untuk Hari " + (j + 1) + ": ");
                suhuKota[i][j] = scanner.nextDouble();
            }
        }
        
        // Menampilkan data suhu
        System.out.println("Data suhu selama 7 hari di lima kota:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Kota: " + kota[i]);
            for (int j = 0; j < 7; j++) {
                System.out.println("Hari " + (j + 1) + ": " + suhuKota[i][j] + " derajat Celsius");
            }
            System.out.println(); // Pemisah antara kota
        }
        
        scanner.close();
    }
}
