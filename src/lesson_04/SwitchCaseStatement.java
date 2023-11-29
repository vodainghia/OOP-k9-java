package lesson_04;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekdays");
                break;
            case 7:
            case 8:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}
