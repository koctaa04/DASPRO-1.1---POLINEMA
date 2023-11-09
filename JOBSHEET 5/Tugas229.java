import java.util.Scanner;

public class Tugas229 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        String username = "user123";
        String password = "password123";

        System.out.print("Enter username: ");
        String inputUsername = input29.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = input29.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login successful! Welcome, " + inputUsername + ".");
        } else {
            System.out.println("Login failed. Please check your username and password.");
        }
    }
}
