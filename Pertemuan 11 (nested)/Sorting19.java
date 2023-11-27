public class Sorting19 {
    public static void main(String[] args) {

        String[][] atlet = {
            {"Luthfi", "Ivan", "Alif", "Budi", "Atta"}, // Badminton
            {"Gab", "Chiko", "Chiki", "Evan", "Rio"}, // Tenis meja
            {"Fifah", "Farrel", "Noval", "Gabgab", "Haikal"}, // Basket
            {"Summit", "Igun", "Ilham", "Novia", "Nia"} // Voli
        };

        String[] olahraga = {"Badminton", "Tenis Meja", "Basket", "Voli"};

        for (int olahragaIndex = 0; olahragaIndex < atlet.length; olahragaIndex++) {
            for (int i = 0; i < atlet[olahragaIndex].length; i++) {
                for (int j = 1; j < atlet[olahragaIndex].length - i; j++) {
                    if (atlet[olahragaIndex][j - 1].compareTo(atlet[olahragaIndex][j]) > 0) {
                        String temp = atlet[olahragaIndex][j];
                        atlet[olahragaIndex][j] = atlet[olahragaIndex][j - 1];
                        atlet[olahragaIndex][j - 1] = temp;
                    }
                }
            }
        }

        System.out.println("Nama atlet:");
        for (int olahragaIndex = 0; olahragaIndex < atlet.length; olahragaIndex++) {
            System.out.print(olahraga[olahragaIndex] + ": ");
            for (int i = 0; i < atlet[olahragaIndex].length; i++) {
                System.out.print(atlet[olahragaIndex][i]);
                if (i < atlet[olahragaIndex].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(); // Tambah baris
        }
    }
}