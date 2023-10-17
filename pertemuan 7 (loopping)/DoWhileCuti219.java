import java.util.Scanner;

public class DoWhileCuti219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    continue;  // Lanjutkan ke iterasi berikutnya jika sisa jatah cuti tidak mencukupi
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break;  // Keluar dari loop jika pengguna memilih untuk tidak mengambil cuti
            } else {
                System.out.println("Input tidak valid. Silakan masukkan y atau t.");
            }
        } while (jatahCuti > 0);

        System.out.println("Terima kasih!");
    }
}
