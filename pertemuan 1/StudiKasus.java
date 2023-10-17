import java.util.Scanner;

class GameTutorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang, David Martinez!");
        System.out.println("Pilih senjata: (1) Melee Weapon, (2) Ranged Weapon");
        int weaponChoice = scanner.nextInt();

        if (weaponChoice == 1) {
            System.out.println("Anda memilih Melee Weapon untuk pertarungan jarak dekat.");

            System.out.println("Masukkan jarak pertarungan (dalam meter): ");
            int distance = scanner.nextInt();

            if (distance <= 5) {
                System.out.println("Anda efektif menggunakan Melee Weapon dalam pertarungan ini.");
            } else {
                System.out.println("Jarak terlalu jauh untuk menggunakan Melee Weapon.");
            }
        } else if (weaponChoice == 2) {
            System.out.println("Anda memilih Ranged Weapon untuk pertarungan jarak jauh.");

            System.out.println("Masukkan jarak pertarungan (dalam meter): ");
            int distance = scanner.nextInt();

            if (distance > 5 && distance <= 1000) {
                System.out.println("Anda efektif menggunakan Ranged Weapon dalam pertarungan ini.");
            } else {
                System.out.println("Jarak terlalu dekat atau terlalu jauh untuk menggunakan Ranged Weapon.");
            }
        } else {
            System.out.println("Pilihan senjata tidak valid.");
        }
    }
}
