import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerlimit = 1;
        int upperlimit = 100;
        int secretNumber = random.nextInt(upperlimit - lowerlimit+ 1) + lowerlimit;
        int numberOfGuesses = 0;
        boolean guessCorrectly = false;

        System.out.println("Taddda!Welcome to Number Guessing Game!");
        System.out.println("we selected a random number between " + lowerlimit + " or " + upperlimit + ". Try to guess it.");

        while (! guessCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfGuesses++;

            if (userGuess < lowerlimit || userGuess > upperlimit) {
                System.out.println("Please enter a valid number between " + lowerlimit + " and " + upperlimit + ".");
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number, which is " + secretNumber + ".");
                System.out.println("It took you " + numberOfGuesses + " guesses.");
                guessCorrectly = true;
            }
        }

        scanner.close();
    }
}