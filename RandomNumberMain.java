package RandomNumber;

import java.util.Random;
import java.util.Scanner;

public interface RandomNumberMain {

	public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int generatedNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int maxAttempts = 5; // Set a predefined limit for attempts
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
}
}
