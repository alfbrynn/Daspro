import java.util.Scanner;
public class UcapanTerimaKasih19 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for beong the best teacher in the world.\n"+"You inspired me in a live for learning and made me feel like i could ask you anything.");
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}