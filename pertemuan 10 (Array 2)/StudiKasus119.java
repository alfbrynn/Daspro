public class StudiKasus119 {
    public static void main(String[] args) {
        int[][] salesData = {
            // Cabang Dieng: {Novel, Komik, Ensiklopedia}
            {2, 8, 0},
            // Cabang Soehat: {Novel, Komik, Ensiklopedia}
            {7, 3, 0},
            // Cabang Sengkaling: {Novel, Komik, Ensiklopedia}
            {4, 6, 5}
        };

        // Menampilkan data penjualan
        for (int branch = 0; branch < 3; branch++) {
            String branchName = "";
            switch (branch) {
                case 0:
                    branchName = "Cabang Dieng";
                    break;
                case 1:
                    branchName = "Cabang Soehat";
                    break;
                case 2:
                    branchName = "Cabang Sengkaling";
                    break;
            }

            System.out.println(branchName + ":");
            System.out.println("Novel: " + salesData[branch][0]);
            System.out.println("Komik: " + salesData[branch][1]);
            System.out.println("Ensiklopedia: " + salesData[branch][2]);
            System.out.println();
        }
    }
}
