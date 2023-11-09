import java.util.Scanner;

public class LoginWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correctUsername = "myuser";
        String correctPassword = "mypassword";

        System.out.println("Welcome to the Login Program");

        while (true) {
            System.out.print("Enter username: ");
            String username = input.nextLine();

            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful! Welcome, " + username + "!");
                break; // Exit the loop if login is successful
            } else {
                System.out.println("Login failed. Please try again.");
            }
        }

        input.close(); // Close the scanner when done
    }
}
