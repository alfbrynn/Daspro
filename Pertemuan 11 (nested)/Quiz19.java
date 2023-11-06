import java.util.Scanner;
import java.util.Random;
public class Quiz19 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

         char menu='y';
         do{
            int number = random.nextInt(10)+1;
            boolean success = false;
            do{
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
                success = (answer == number);
                if (!success) {
                    if (answer < number) {
                        System.out.println("Tebakan terlalu kecil.");
                    } else {
                        System.out.println("Tebakan terlalu besar.");
                    }
                }
            } while(!success);
             System.out.print("Apakah Anda ingin mengulang permainan (Y/y)? ");
             menu = input.nextLine().charAt(0);
        } while(menu=='y' || menu =='Y');

        System.out.println("Terima kasih telah bermain!");
    }   
}