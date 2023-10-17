import java.util.Scanner;

public class WhileGaji19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur, totalGajiLembur;
        gajiLembur = 0;
        totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = sc.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manager, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": "); 
            jabatan = sc.next(); 

            if (!(jabatan.equalsIgnoreCase("Direktur") || jabatan.equalsIgnoreCase("Manager") || jabatan.equalsIgnoreCase("Karyawan"))) {
                System.out.println("Jabatan tidak valid. Silakan masukkan jabatan jabatan yang valid.3 ");
                continue;
            }

            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = sc.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("Manager")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }

            totalGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur: " + totalGajiLembur);
        }
    }
}
