package Hangman;


	import java.util.Random;
	import java.util.Scanner;

	public class HangmanGame {

	    public static void main(String[] args) {
	        // Array of words to choose from
	        String[] words = {"java", "hangman", "programming", "computer", "code"};

	        // Select a random word
	        Random random = new Random();
	        String selectedWord = words[random.nextInt(words.length)];

	        // Create an array to represent the word's display
	        char[] display = new char[selectedWord.length()];
	        for (int i = 0; i < display.length; i++) {
	            display[i] = '_';
	        }

	        // Variables for tracking game state
	        int incorrectGuesses = 0;
	        int maxIncorrectGuesses = 6; // Maximum number of incorrect guesses allowed

	        // Scanner for user input
	        Scanner scanner = new Scanner(System.in);

	        // Main game loop
	        while (incorrectGuesses < maxIncorrectGuesses) {
	            // Display the current state of the word
	            System.out.println("Current word: " + String.valueOf(display));

	            // Prompt the user for a letter
	            System.out.print("Enter a letter: ");
	            char guess = scanner.next().charAt(0);

	            // Check if the letter is in the word
	            boolean found = false;
	            for (int i = 0; i < selectedWord.length(); i++) {
	                if (selectedWord.charAt(i) == guess) {
	                    display[i] = guess;
	                    found = true;
	                }
	            }

	            // Update game state based on the guess
	            if (!found) {
	                incorrectGuesses++;
	                System.out.println("Incorrect guesses: " + incorrectGuesses);
	                displayHangman(incorrectGuesses);
	            }

	            // Check if the word is complete
	            if (String.valueOf(display).equals(selectedWord)) {
	                System.out.println("Congratulations! You guessed the word: " + selectedWord);
	                break;
	            }
	        }

	        // Close the scanner
	        scanner.close();
	    }

	    // Method to display the hangman figure based on incorrect guesses
	    private static void displayHangman(int incorrectGuesses) {
	        System.out.println("Hangman figure:");

	        switch (incorrectGuesses) {
	            case 1:
	                System.out.println("  O");
	                break;
	            case 2:
	                System.out.println("  O");
	                System.out.println("  |");
	                break;
	            case 3:
	                System.out.println("  O");
	                System.out.println(" /|");
	                break;
	            case 4:
	                System.out.println("  O");
	                System.out.println(" /|\\");
	                break;
	            case 5:
	                System.out.println("  O");
	                System.out.println(" /|\\");
	                System.out.println(" /");
	                break;
	            case 6:
	                System.out.println("  O");
	                System.out.println(" /|\\");
	                System.out.println(" / \\");
	                System.out.println("Game over! The word was: " + "selectedWord");
	                break;
	        }
	    }
}
