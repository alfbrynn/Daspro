import java.util.Scanner;

public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");

            System.out.print("Masukkan pilihan: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.println("Masukkan baris: ");
                    next = sc.nextLine();
                    if (next.matches("\\d+")) {
                        baris = Integer.parseInt(next);
                        System.out.println("Masukkan kolom: ");
                        next = sc.nextLine();
                        if (next.matches("\\d+")) {
                            kolom = Integer.parseInt(next);
                            if (penonton[baris-1][kolom-1] != null) {
                                System.out.println("Kursi sudah terisi oleh penonton lain.");
                            } else {
                                penonton[baris-1][kolom-1] = nama;
                            }
                        } else {
                            System.out.println("Kolom kursi tidak tersedia.");
                        }
                    } else {
                        System.out.println("Baris kursi tidak tersedia.");
                    }
                    break;

                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.printf("Baris %d, Kolom %d: ***\n", i+1, j+1);
                            } else {
                                System.out.printf("Baris %d, Kolom %d: %s\n", i+1, j+1, penonton[i][j]);
                            }
                        }
                    }
                    break;

                case 3:
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
