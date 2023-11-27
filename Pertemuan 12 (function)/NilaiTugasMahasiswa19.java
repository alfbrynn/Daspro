import java.util.Scanner;

public class NilaiTugasMahasiswa19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();

        int[][] nilaiMahasiswa = inputNilaiMahasiswa(jumlahMahasiswa, jumlahTugas);
        tampilkanNilaiMahasiswa(nilaiMahasiswa);
        System.out.println(cariHariNilaiTertinggi(nilaiMahasiswa));
        tampilkanMahasiswaNilaiTerendah(nilaiMahasiswa);
    }

    public static int[][] inputNilaiMahasiswa(int jumlahMahasiswa, int jumlahTugas) {
        Scanner scanner = new Scanner(System.in);
        int[][] nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai tugas mahasiswa ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
        return nilaiMahasiswa;
    }

    public static void tampilkanNilaiMahasiswa(int[][] nilaiMahasiswa) {
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("Nilai tugas mahasiswa ke-" + (i + 1) + ":");
            for (int j = 0; j < nilaiMahasiswa[0].length; j++) {
                System.out.println("Minggu ke-" + (j + 1) + ": " + nilaiMahasiswa[i][j]);
            }
        }
    }

    public static String cariHariNilaiTertinggi(int[][] nilaiMahasiswa) {
        int nilaiTertinggi = Integer.MIN_VALUE;
        int mingguTertinggi = -1;
        for (int j = 0; j < nilaiMahasiswa[0].length; j++) {
            int maxNilaiMinggu = Integer.MIN_VALUE;
            for (int i = 0; i < nilaiMahasiswa.length; i++) {
                if (nilaiMahasiswa[i][j] > maxNilaiMinggu) {
                    maxNilaiMinggu = nilaiMahasiswa[i][j];
                }
            }
            if (maxNilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = maxNilaiMinggu;
                mingguTertinggi = j + 1;
            }
        }
        return "Nilai tertinggi terdapat pada minggu ke-" + mingguTertinggi;
    }

    public static void tampilkanMahasiswaNilaiTerendah(int[][] nilaiMahasiswa) {
        int nilaiTerendah = Integer.MAX_VALUE;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            for (int j = 0; j < nilaiMahasiswa[0].length; j++) {
                if (nilaiMahasiswa[i][j] < nilaiTerendah) {
                    nilaiTerendah = nilaiMahasiswa[i][j];
                }
            }
        }
        System.out.println("Mahasiswa yang memiliki nilai terendah:");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            for (int j = 0; j < nilaiMahasiswa[0].length; j++) {
                if (nilaiMahasiswa[i][j] == nilaiTerendah) {
                    System.out.println("Mahasiswa ke-" + (i + 1) + " pada minggu ke-" + (j + 1));
                }
            }
        }
    }
}
