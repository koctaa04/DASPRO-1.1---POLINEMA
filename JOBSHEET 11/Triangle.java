import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        // for (int iOuter = 1; iOuter <= n; iOuter++) {
        //     for (int j = 1; j <= iOuter; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        int iOuter = 0;
        while (iOuter < n) {
            int j = 0;
            while (j <= iOuter) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            iOuter++;
        }
    }
}
