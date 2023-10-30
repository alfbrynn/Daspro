public class  LinearSearch19{
    public static void main(String[] args) {
        int[] arryInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int hasil = 0;

        for (int i = 0; i < arryInt.length; i++) {
            if (arryInt[i] == key){
                hasil = i;
                break;
            }
        }
        System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
    }
}