import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginSystem {
    private static Map<String, String> userCredentials = new HashMap<>();

    public static void main(String[] args) {
        // Menambahkan contoh data pengguna (username dan password)
        userCredentials.put("john_doe", "password123");
        userCredentials.put("jane_doe", "qwerty");

        // Meminta input username dan password dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        // Memeriksa apakah kredensial sesuai dan memberikan respons
        if (authenticate(username, password)) {
            System.out.println("Login berhasil. Selamat datang, " + username + "!");
        } else {
            System.out.println("Username atau password salah.");
        }
    }

    private static boolean authenticate(String username, String password) {
        // Memeriksa apakah username ada dalam data pengguna
        if (userCredentials.containsKey(username)) {
            // Memeriksa apakah password cocok dengan yang disimpan
            String storedPassword = userCredentials.get(username);
            return storedPassword.equals(password);
        }
        return false;
    }
}
