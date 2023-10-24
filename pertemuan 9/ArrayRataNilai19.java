import java.util.Scanner;
public class ArrayRataNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Masukkan jumlah mahasiswa: ");
         int jumlahMhs = sc.nextInt(); 
         int[] nilaiMhs= new int[jumlahMhs];
         double totalLulus = 0;
         double totalTidakLulus = 0;
         double rata2Lulus;
         double rata2TidakLulus;
         int lulus = 0;
         int tidakLulus = 0;

         for (int i = 0; i < nilaiMhs.length;i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] >= 70) {
                lulus++;
                totalLulus += nilaiMhs[i];
            } else {
                tidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
        }

        rata2Lulus = totalLulus/lulus;
        rata2TidakLulus = totalTidakLulus/tidakLulus;
        
        System.out.println("Rata-rata nilai lulus= "+rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus= "+rata2TidakLulus);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidakLulus);
    }
}