import java.util.Scanner;

public class LinearSearch29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil = 0;

        System.out.print("Masukkan banyaknya isi array: ");
        int n = input.nextInt();
        int[] arrayInt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan isi array ke-" + (i) + ": ");
            arrayInt[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = input.nextInt();


        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        System.out.println("Nilai " + key + " ditemukan pada index ke-" + hasil);

    }
}
