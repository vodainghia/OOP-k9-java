package labs.lab_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab_4_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> arrList = new ArrayList<>();
            boolean exit = false;
            while (!exit) {
                printUserMenu();
                int userSelection = getUserSelection(scanner);

                switch (userSelection) {
                    case 1 -> addNumber(arrList, scanner);
                    case 2 -> printArrayList(arrList);
                    case 3 -> findMaximum(arrList);
                    case 4 -> findMinimum(arrList);
                    case 5 -> findIndexOf(arrList, scanner);
                    case 6 -> exit = true;
                    default -> System.out.println("Invalid input, please try again!");
                }
            }
        }

        System.out.println("Exiting...");
    }

    private static int getUserSelection(Scanner scanner) {
        System.out.print("Please enter your selection: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.nextLine(); // consume the newline character
        }
        return scanner.nextInt();
    }

    private static void findIndexOf(List<Integer> arrList, Scanner scanner) {
        System.out.print("Please input number: ");
        try {
            int num = scanner.nextInt();
            int index = arrList.indexOf(num);
            if (index == -1) {
                System.out.println("The number is not existing!");
            } else {
                System.out.println("The index is: " + index);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.nextLine(); // consume the newline character
        }
    }

    private static void findMinimum(List<Integer> arrList) {
        if (arrList.isEmpty()) {
            System.out.println("The list is empty. Please add any integer first!");
        } else {
            int min = arrList.get(0);
            for (Integer num : arrList) {
                min = Math.min(min, num);
            }
            System.out.println("Minimum value is: " + min);
        }
    }

    private static void findMaximum(List<Integer> arrList) {
        if (arrList.isEmpty()) {
            System.out.println("The list is empty. Please add any integer first!");
        } else {
            int max = arrList.get(0);
            for (Integer num : arrList) {
                max = Math.max(max, num);
            }
            System.out.println("Maximum value is: " + max);
        }
    }

    private static void printArrayList(List<Integer> arrList) {
        System.out.println(Arrays.toString(arrList.toArray()));
    }

    private static void addNumber(List<Integer> arrList, Scanner scanner) {
        System.out.print("Please input number: ");
        try {
            arrList.add(scanner.nextInt());
            System.out.println("The number has been added.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.nextLine(); // consume the newline character
        }
    }

    static void printUserMenu() {
        String menu = """
                                
                ====== MENU ======
                1. Add number into ArrayList
                2. Print numbers
                3. Get maximum number
                4. Get minimum number
                5. Find index of a number
                6. Exit
                """;

        System.out.println(menu);
    }
}
