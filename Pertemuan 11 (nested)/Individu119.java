import java.util.Scanner;

public class Individu119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();
        
        if (N < 3) {
            System.out.println("N harus minimal 3.");
            return;
        }

        for (int i = 1; i <= N; i++) {
            // Mencetak spasi untuk membuat segitiga menghadap ke kanan
            for (int j = 1; j <= N - i; j++) {
                System.out.print("  ");
            }
            
            // Mencetak angka dalam baris
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            
            System.out.println();
        }
    }
}
