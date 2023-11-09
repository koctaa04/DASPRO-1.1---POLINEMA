import java.util.Scanner;
public class ForKelipatan29 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner (System.in);
        int kelipatan, jumlah = 0, counter = 0;
        double rerata;

        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input13.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }

        System.out.printf("Banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1-50 adalah %d\n", kelipatan, jumlah);

        if (counter > 0) {
            rerata = (double) jumlah / counter ;
            System.out.printf("Rerata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rerata);
        } else {
            System.out.println("Rerata bilangan kelipatan " + kelipatan + " dari 1 sampai 50 kosong");
        }
        
    }
}