import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class GedungSerbaguna {
    private static Map<String, User> userMap = new HashMap<>();
    private static boolean isLoggedIn = false;
    private static User loggedInUser = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMainMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 3:
                    System.out.println("======================================");
                    System.out.println(" Selamat Tinggal Sampai Jumpa Lagi ! ");
                    System.out.println("======================================");
                    return;
                default:
                    System.out.println("==============================================");
                    System.out.println(" Pilihanmu tidak diketahui, mohon coba lagi ");
                    System.out.println("==============================================");
                    break;
            }

            if (isLoggedIn) {
                while (true) {
                    displayLoggedInMenu();

                    int userChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (userChoice) {
                        case 1:
                            loggedInUser.checkIn(scanner);
                            break;
                        case 2:
                            loggedInUser.viewBooking();
                            break;
                        case 3:
                            loggedInUser.informasiUser();
                            break;
                        case 4:
                            System.out.println("=====================");
                            System.out.println(" Anda Sudah Logout ");
                            System.out.println("=====================");
                            isLoggedIn = false;
                            loggedInUser = null;
                            break;
                        default:
                            System.out.println("=============================================");
                            System.out.println(" Pilihanmu tidak diketahui, mohon coba lagi ");
                            System.out.println("=============================================");
                            break;
                    }

                    if (userChoice == 4) {
                        break;
                    }
                }
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("======================================");
        System.out.println(" Selamat Datang di Gedung Serba Guna ");
        System.out.println("======================================");
        System.out.println("1. Buat Akun");
        System.out.println("2. Masuk");
        System.out.println("3. Keluar");
        System.out.print("Masukkan Pilihanmu : ");
    }

    private static void displayLoggedInMenu() {
        System.out.println("1. Check-in");
        System.out.println("2. Lihat Booking");
        System.out.println("3. Informasi User");
        System.out.println("4. Keluar");
        System.out.print("Masukkan Pilihamu : ");
    }

    private static void createAccount(Scanner scanner) {
        System.out.println("============");
        System.out.println(" Buat Akun ");
        System.out.println("============");
        System.out.print("Masukkan NIK : ");
        String nik = scanner.nextLine();
        System.out.print("Masukkan Username : ");
        String username = scanner.nextLine();
        System.out.print("Masukkan Tanggal Lahir : ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Masukkan No Telephone (10 digits) : ");

        String phoneNumber;
        // Using a for loop for input validation of phone number
        while (true) {
            phoneNumber = scanner.nextLine();
            if (phoneNumber.matches("\\d{10}")) {
                break;
            } else {
                System.out.print("Masukkan No Telephone yang valid (10 digits): ");
            }
        }

        System.out.print("Masukkan Alamat : ");
        String address = scanner.nextLine();
        System.out.print("Masukkan Kata Sandi : ");
        String password = scanner.nextLine();

        User newUser = new User(nik, username, dateOfBirth, phoneNumber, address, password);

        userMap.put(username, newUser);

        System.out.println("==================================================");
        System.out.println(" Akun berhasil dibuat, anda sekarang sudah login ");
        System.out.println("==================================================");
        isLoggedIn = true;
        loggedInUser = newUser;
    }

    private static void login(Scanner scanner) {
        System.out.println("========");
        System.out.println(" Masuk ");
        System.out.println("=======");

        String username;
        String password;

        do {
            System.out.print("Masukkan Username : ");
            username = scanner.nextLine();
            System.out.print("Masukkan Kata Sandi : ");
            password = scanner.nextLine();

            User user = userMap.get(username);
            if (user != null && user.getPassword().equals(password)) {
                System.out.println("==================================================");
                System.out.println(" Masuk Berhasil. Selamat Datang, " + username + "!");
                System.out.println("==================================================");
                isLoggedIn = true;
                loggedInUser = user;
                break;
            } else {
                System.out.println("Password dan Username anda salah");
                System.out.print("Coba lagi? (y/n): ");
                String tryAgain = scanner.nextLine();
                if (!tryAgain.equalsIgnoreCase("y")) {
                    break;
                }
            }
        } while (true);
    }
}

class User {
    // ... (unchanged)

    public void checkIn(Scanner scanner) {
        // ... (unchanged)
    }

    public void viewBooking() {
        // ... (unchanged)
    }

    public void informasiUser() {
        // ... (unchanged)
    }
}
