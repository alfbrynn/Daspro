import java.util.Scanner;

public class Toko19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String namaPelanggan = input.nextLine();

        int totalItem = 0;
        double totalHarga = 0;
        double totalDiskon = 0;

        while (true) {
            System.out.print("Masukkan nama produk yang Anda beli ('done' untuk mengakhiri): ");
            String namaProduk = input.nextLine();

            if (namaProduk.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Banyaknya: ");
            int qty = input.nextInt();
            System.out.print("Harga: ");
            double harga = input.nextDouble();
            System.out.print("Diskon (%): ");
            double diskon = input.nextDouble();
            input.nextLine();

            totalItem += qty;
            double hargaProduk = harga * qty;
            double diskonProduk = (hargaProduk * diskon) / 100;
            totalHarga += hargaProduk;
            totalDiskon += diskonProduk;
        }

        System.out.print("Apakah Anda punya kartu member (Y/N)? ");
        String memberStatus = input.nextLine();
        boolean isMember = memberStatus.equalsIgnoreCase("Y");

        if (isMember) {
            totalDiskon += totalHarga * 10 / 100;
        }

        double totalAkhir = totalHarga - totalDiskon;

        //bu doakan nilainya memuaskan
        System.out.println("\n---Total Pembelian---");
        System.out.println("Nama pelanggan: " + namaPelanggan);
        System.out.println("Tipe: " + (isMember ? "Member" : "Bukan Member"));
        System.out.println("Total item barang yang dibeli: " + totalItem);
        System.out.println("Subtotal = " + totalHarga);
        System.out.println("Total Diskon = " + totalDiskon);
        System.out.println("Total yang harus dibayar = " + totalAkhir);
    }
}