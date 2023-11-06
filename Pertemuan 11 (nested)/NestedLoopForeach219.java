public class NestedLoop_2341720025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris = 5;
        int kolom = 7;
        double[][] temps = new double[baris][kolom];
        
        for (int i = 0; i < baris; i++) {
            System.out.println("Kota ke-" + i);
            double totalSuhu = 0.0;
            for (int j = 0; j < kolom; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
                totalSuhu += temps[i][j];
            }
            double rataRata = totalSuhu / kolom;
            System.out.println("Rata-rata suhu kota ke-" + i + " adalah: " + rataRata);
            System.out.println();
        }
    }
}
