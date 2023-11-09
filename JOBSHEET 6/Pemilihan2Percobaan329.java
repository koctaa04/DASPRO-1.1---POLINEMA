import java.util.Scanner;

public class Pemilihan2Percobaan329 {
    
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        String category;
        int inCome, netSalary;
        double tax;

        System.out.print("Enter a category : ");
        category = input29.nextLine();
        System.out.print("Enter inCome : ");
        inCome = input29.nextInt();
        
        if (category.equalsIgnoreCase("worker")) {
            if (inCome <= 2000000) {
                tax = 0.1;
            } else if (inCome <= 3000000) {
                tax = 0.15;
            } else {
                tax = 0.2;
            }
            netSalary = (int) (inCome - (inCome * tax));
            System.out.println("The net salary : " + netSalary);
        } else if (category.equalsIgnoreCase("businessman")) {
            if (inCome <= 250000000) {
                tax = 0.15;
            } else if (inCome <= 35000000) {
                tax = 0.2;
            } else {
                tax = 0.25;
            }
            netSalary = (int) (inCome - (inCome * tax));
            System.out.println("The net salary : " + netSalary);
        } else {
            System.out.println("category pekerjaan tidak valid");;
        }
    }
}
