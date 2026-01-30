import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int number = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Guessing Game");
        System.out.println("Guess a number between 1 and 100");

        while (true) {
            System.out.print("Enter your guess: ");

            if (!sc.hasNextInt()) {
                System.out.println("❌ Enter numbers only!");
                sc.next();
                continue;
            }

            int guess = sc.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("⚠️ Please enter a number between 1 and 100.");
                continue;
            }

            attempts++;

            if (guess < number) {
                System.out.println("Too Low! Try again.");
            } else if (guess > number) {
                System.out.println("Too High! Try again.");
            } else {
                System.out.println("🎉 Correct!");
                System.out.println("You guessed it in " + attempts + " attempts.");
                break;
            }
        }

        sc.close();
    }
}
