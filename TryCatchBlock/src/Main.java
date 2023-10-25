import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            System.out.print("Please enter an index number : ");
            int index = scanner.nextInt(); // Kullanıcıdan indeksi al

            int element = elementLoop(arr, index);
            System.out.println("Array's Element : " + element);


            // int index = 15;
            // int eleman = elementLoop(arr, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : An index that is beyond the array size was entered.");
        }
    }

    public static int elementLoop(int[] arr, int index) {
        // Belirtilen indeksi kontrol et
        if (index < 0 || index >= arr.length) {
            // Eğer indeks dizi boyutunun dışındaysa, hata mesajı fırlat
            throw new ArrayIndexOutOfBoundsException();
        }

        // Dizi elemanını döndür
        return arr[index];
    }
}
