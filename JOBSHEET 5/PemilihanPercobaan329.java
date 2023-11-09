import java.util.Scanner;

public class PemilihanPercobaan329 {
    public static void main(String[] args) {
        double angka1, angka2, hasil;
        char operator;

        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        angka1 = input29.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input29.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = input29.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.printf("Hasil dari angka %s + %s = %s", angka1, angka2, hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.printf("Hasil dari angka %s - %s = %s", angka1, angka2, hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.printf("Hasil dari angka %s * %s = %s", angka1, angka2, hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.printf("Hasil dari angka %s / %s = %s", angka1, angka2, hasil);
                break;
            default:
                break;
        }
    }
}
