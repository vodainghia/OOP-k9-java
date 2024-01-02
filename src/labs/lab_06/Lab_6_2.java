package labs.lab_06;

import java.util.Scanner;

public class Lab_6_2 {
    public static void main(String[] args) {
        // String myPassword = "password123";
        // Allow user to input maximum 3 times
        String myPassword = "password123";
        Scanner userInput = new Scanner(System.in);
        int maxAttempted = 3, count = 0;

        while (count < maxAttempted) {
            String userAttempted = userInput.nextLine();
            if (!userAttempted.equals(myPassword)) {
                System.out.println("Wrong password, please try again!");
                count++;
            } else {
                System.out.println("Correct!");
                System.exit(0);
            }
        }

        System.out.println("Maximum attempts reached. Exiting...");
        System.exit(0);

    }
}
