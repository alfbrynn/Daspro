import java.util.Scanner;

public class Tugas119{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan banyaknya elemen:");
        int jumlahElemen = scanner.nextInt();

        int[] array = new int[jumlahElemen];

        System.out.println("Masukkan nilai-nilai elemen:");
        for (int i = 0; i < jumlahElemen; i++) {
            array[i] = scanner.nextInt();
        }

        int nilaiTertinggi = array[0];
        int nilaiTerendah = array[0];
        double total = 0;

        for (int i = 0; i < jumlahElemen; i++) {
            if (array[i] > nilaiTertinggi) {
                nilaiTertinggi = array[i];
            }
            if (array[i] < nilaiTerendah) {
                nilaiTerendah = array[i];
            }
            total += array[i];
        }

        double nilaiRataRata = total / jumlahElemen;

        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata: " + nilaiRataRata);
    }
}
