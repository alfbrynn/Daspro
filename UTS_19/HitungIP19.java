import java.util.Scanner;

public class HitungIP19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Bismillah lancar
        // Masukkan nama mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = input.nextLine();
        
        double totalNilaiSKS = 0;
        double totalSKS = 0;
        int jumlahPerbaikanRemidi = 0;
        
        String namaMataKuliah = "";
        while (!namaMataKuliah.equalsIgnoreCase("selesai")) {
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah = input.nextLine();
            
            if (namaMataKuliah.equalsIgnoreCase("selesai")) {
                break;
            }
            
            System.out.print("Nilai (A, B+, B, C+, C, D, E): ");
            String indeksNilai = input.next();
            
            System.out.print("Masukkan jumlah SKS: ");
            int sks = input.nextInt();
            
            // Menghitung nilai SKS
            double nilaiSKS = 0;
            switch (indeksNilai.toUpperCase()) {
                case "A":
                    nilaiSKS = 4.0;
                    break;
                case "B+":
                    nilaiSKS = 3.5;
                    break;
                case "B":
                    nilaiSKS = 3.0;
                    break;
                case "C+":
                    nilaiSKS = 2.5;
                    break;
                case "C":
                    nilaiSKS = 2.0;
                    break;
                case "D":
                case "E":
                    jumlahPerbaikanRemidi++;
                    break;
                default:
                    System.out.println("Indeks nilai tidak valid!");
                    break;
            }
            
            totalNilaiSKS += nilaiSKS * sks;
            totalSKS += sks;
            
            input.nextLine();
            
            System.out.print("Apakah lanjut input nilai (Y / N) ? ");
            String lanjut = input.next();
            input.nextLine();
            
            if (!lanjut.equalsIgnoreCase("Y")) {
                break;
            }
        }
        
        // Menghitung Indeks Prestasi (IP)
        double ip = totalNilaiSKS / totalSKS;
        
        // Output hasil perhitungan
        System.out.println("..............Hasil Perhitungan IP................");
        System.out.println("Nama: " + namaMahasiswa);
        System.out.println("Indeks Prestasi (IP): " + String.format("%.2f", ip));
        System.out.println("Jumlah mata kuliah: " + (totalSKS / 3));
        System.out.println("Jumlah SKS: " + totalSKS);
        System.out.println("Jumlah MK yang harus perbaikan/renidi: " + jumlahPerbaikanRemidi);
        System.out.println("..................................................");
    }
}