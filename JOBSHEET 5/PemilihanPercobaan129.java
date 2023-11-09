import java.util.Scanner;

public class PemilihanPercobaan129 {
    public static void main(String[] args) {
        int inputan;
        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        inputan = input29.nextInt();
        
        // Ternary Operator
        String hasil;
        hasil = (inputan % 2 == 0) ? (inputan + " adalah bilangan genap") : (inputan + " adalah bilangan ganjil");
        System.out.println(hasil);
        
        // IF Else
        if (inputan % 2 == 0) {
            System.out.println(inputan + " adalah bilangan genap");
        } else {
            System.out.println(inputan + " adalah bilangan ganjil");
        }
    }
}