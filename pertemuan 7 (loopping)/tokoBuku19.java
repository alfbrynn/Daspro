import java.util.Scanner;

public class tokoBuku19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jenis buku (kamus, novel, atau lainnya)
        System.out.print("Jenis buku (kamus, novel, atau lainnya): ");
        String jenisBuku = scanner.nextLine().toLowerCase();

        // Input jumlah buku
        System.out.print("Jumlah buku: ");
        int jumlahBuku = scanner.nextInt();

        // Input harga per buku
        System.out.print("Harga per buku: ");
        double hargaPerBuku = scanner.nextDouble();

        scanner.close();

        // Input diskon
        double diskonAwal = 0;
        double tambahanDiskon = 0;

        // Proses if else kalkulasi total diskon
        if (jenisBuku.equals("kamus")) {
            if (jumlahBuku > 2) {
                diskonAwal = 0.10;
                tambahanDiskon = 0.02;
            } else {
                diskonAwal = 0.10;
            }
        } else if (jenisBuku.equals("novel")) {
            if (jumlahBuku > 3) {
                diskonAwal = 0.07;
                tambahanDiskon = 0.02;
            } else {
                diskonAwal = 0.07;
            }
            if (jumlahBuku <= 3) {
                diskonAwal = 0.07;
                tambahanDiskon = 0.01;
            }
        } else {
            if (jumlahBuku > 3) {
                diskonAwal = 0.05;
            }
        }

        // Total diskon
        double totalDiskon = diskonAwal + tambahanDiskon;

        // Total harga setelah diskon
        double totalHarga = jumlahBuku * hargaPerBuku;
        double hargaSetelahDiskon = totalHarga * (1 - totalDiskon);

        // Output harga total (hore)
        System.out.println("Total diskon: " + (totalDiskon * 100) + "%");
        System.out.println("Harga total setelah diskon: Rp" + hargaSetelahDiskon);
    }
}
