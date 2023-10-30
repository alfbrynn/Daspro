import java.util.Scanner;

public class LinearSearch319 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        // Inisialisasi array
        int[] array = new int[n];

        // Membaca isi array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen array ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Menerima input key yang ingin dicari
        System.out.print("Masukkan key yang ingin dicari: ");
        int key = input.nextInt();

        // Mencari key dalam array
        int hasil = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == key) {
                hasil = i;
                break;
            }
        }

        // Mencetak hasil pencarian
        if (hasil == -1) {
            System.out.println("Key tidak ditemukan");
        } else {
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        }
    }
}