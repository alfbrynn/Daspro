import java.util.Scanner;

public class DoWhileCuti119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        outerLoop: do {
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
                    // Tambahkan inner loop untuk memungkinkan pengisian ulang jumlah hari
                    while (true) {
                        System.out.print("Apakah Anda ingin mengisi jumlah hari kembali (y/t)? ");
                        konfirmasi = sc.next();
                        if (konfirmasi.equalsIgnoreCase("y")) {
                            System.out.print("Jumlah hari: ");
                            jumlahHari = sc.nextInt();
                            if (jumlahHari <= jatahCuti) {
                                jatahCuti -= jumlahHari;
                                System.out.println("Sisa jatah cuti: " + jatahCuti);
                                break;  // Keluar dari inner loop
                            } else {
                                System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                            }
                        } else {
                            break outerLoop;  // Keluar dari outer loop jika pengguna tidak ingin isi jumlah hari lagi
                        }
                    }
                }
            }
        } while (jatahCuti > 0);

        System.out.println("Terima kasih!");
    }
}
