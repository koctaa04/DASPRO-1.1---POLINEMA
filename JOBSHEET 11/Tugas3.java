import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == n || j==1) {
                    System.out.print(n + " ");
                } else {
                    System.out.print(" ");
                    System.out.print(" ");
                    
                }
            }
            System.out.println();
        }
    }
}
