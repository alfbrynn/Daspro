import java.util.Scanner;
import java.util.Arrays;
public class NestedLoop_2341720025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris = 5;
        int kolom = 7;
        double[][] temps = new double[baris][kolom];
        
        for (int i=0; i < temps.length; i++){
            System.out.println("Kota ke-" + i);
            for (int j=0; j<temps[0].length; j++){
                System.out.print("Hari ke-" + (j+1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        for(int i=0; i<temps.length; i++){
            System.out.print("Kota ke-" + i);
            for(int j=0; j < temps[0].length; j++){
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }
    }
}