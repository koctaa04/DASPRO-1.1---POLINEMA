import java.util.Scanner;

/**
 * nestedLoop
 */
public class NestedLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double [][] temps = new Double[2][7];
        Double total = 0.0 , avg = 0.0;

        for (int i = 0; i < temps.length; i++) {
            System.out.println("kota ke-" + (i + 1));
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                temps[i][j] = sc.nextDouble();
                total += temps[i][j];
                avg = total / (temps.length * temps[i].length);
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.println("kota ke- " + (i + 1) + " : ");
            // for (int j = 0; j < temps[i].length; j++) {
            //     System.out.print(temps[i][j] + " ");
            // }
            for (Double temp : temps[i]) {
                System.out.println(temp + " ");
            }
            System.out.println();
            System.out.println("Rata-rata suhu kota ke- " + (i + 1) + " : " + avg);
            System.out.println();
        }
    }
}