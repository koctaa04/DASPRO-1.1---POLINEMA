import java.util.Random;
import java.util.Scanner;

public class Quiz {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    char menu = 'y';
    do {
        int number = rand.nextInt(3) + 1;
        boolean success = false;
        do {
            System.out.print("Guess the number (1-10): ");
            int answer = input.nextInt();

            if (answer < number) {
                System.out.println("Too low");
            } else if (answer > number) {
                System.out.println("Too high");
            }
            input.nextLine();
            success = answer == number;
            
        } while (!success);

        System.out.println("Good Job, your answer is correct. Do you want to play again? (Y/N)");
        menu = input.nextLine().charAt(0);
        input.nextLine();
    } while (menu == 'Y' || menu == 'y');
 }   
}
