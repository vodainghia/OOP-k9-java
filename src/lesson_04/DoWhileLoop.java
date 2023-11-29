package lesson_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int guessingTime = 0;
        int max = 3;
        int randomNumber = new SecureRandom().nextInt(5);

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your guessing number from 1 to 5");

            int userInput = scanner.nextInt();
            if (userInput == randomNumber) {
                System.out.println("Congratulations! You guessed it right!");
                break;
            }

            guessingTime++;
            System.out.println("Try again! You have " + (max - guessingTime) + " guesses left");

        } while (guessingTime <= max);

        System.out.println("Game over!");
    }
}
