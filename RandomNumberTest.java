package RandomNumber;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberTest {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int generatedNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int maxAttempts = 5; // Set a predefined limit for attempts
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break;
            } else if (userGuess < generatedNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            if (attempts < maxAttempts) {
                System.out.println("You have " + (maxAttempts - attempts) + " attempts remaining.\n");
            } else {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + generatedNumber);
            }
        }

        scanner.close();
    }
}
