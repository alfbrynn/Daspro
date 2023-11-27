import java.util.Scanner;

public class BintangSegitigaKanan19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            // Cetak spasi untuk membuat segitiga terbalik
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            
            // Cetak bintang
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
