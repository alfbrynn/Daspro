import java.util.Scanner;

public class NilaiTugas19 {
    public static void main(String[] args) {
        String[][] dataMahasiswa = inputNilaiMahasiswa();
        tampilkanNilaiMahasiswa(dataMahasiswa);
        System.out.println(cariHariNilaiTertinggi(dataMahasiswa));
        tampilkanMahasiswaNilaiTerendah(dataMahasiswa);
    }

    public static String[][] inputNilaiMahasiswa() {
        String[][] dataMahasiswa = {
                {"Sari", "20", "19", "25", "20", "10", "0", "10"},
                {"Rina", "30", "30", "40", "10", "15", "20", "25"},
                {"Yani", "5", "0", "20", "25", "10", "5", "45"},
                {"Dwi", "50", "0", "7", "8", "0", "30", "60"},
                {"Lusi", "15", "10", "16", "15", "10", "10", "5"}
        };
        return dataMahasiswa;
    }

    public static void tampilkanNilaiMahasiswa(String[][] dataMahasiswa) {
        System.out.printf("%-15s", "Nama Mahasiswa");
        for (int j = 1; j < dataMahasiswa[0].length; j++) {
            System.out.printf("%-10s", "Minggu " + j);
        }
        System.out.println();
        for (String[] row : dataMahasiswa) {
            System.out.printf("%-15s", row[0]);
            for (int j = 1; j < row.length; j++) {
                System.out.printf("%-10s", row[j]);
            }
            System.out.println();
        }
    }

    public static String cariHariNilaiTertinggi(String[][] dataMahasiswa) {
        int nilaiTertinggi = Integer.MIN_VALUE;
        int mingguTertinggi = -1;
        for (int j = 1; j < dataMahasiswa[0].length; j++) {
            int maxNilaiMinggu = Integer.MIN_VALUE;
            for (String[] row : dataMahasiswa) {
                int nilai = Integer.parseInt(row[j]);
                if (nilai > maxNilaiMinggu) {
                    maxNilaiMinggu = nilai;
                }
            }
            if (maxNilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = maxNilaiMinggu;
                mingguTertinggi = j;
            }
        }
        return "Nilai tertinggi terdapat pada minggu ke-" + mingguTertinggi;
    }

    public static void tampilkanMahasiswaNilaiTerendah(String[][] dataMahasiswa) {
        int nilaiTerendah = Integer.MAX_VALUE;
        for (String[] row : dataMahasiswa) {
            for (int j = 1; j < row.length; j++) {
                int nilai = Integer.parseInt(row[j]);
                if (nilai < nilaiTerendah) {
                    nilaiTerendah = nilai;
                }
            }
        }
        System.out.println("Mahasiswa yang memiliki nilai terendah:");
        for (String[] row : dataMahasiswa) {
            for (int j = 1; j < row.length; j++) {
                int nilai = Integer.parseInt(row[j]);
                if (nilai == nilaiTerendah) {
                    System.out.printf("%-15s pada minggu ke-%d%n", row[0], j);
                }
            }
        }
    }
}
