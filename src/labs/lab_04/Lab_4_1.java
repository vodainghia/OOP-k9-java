package labs.lab_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printUserMenu();
        int userSelection = scanner.nextInt();
        List<Integer> arrList = new ArrayList<>();

        while (userSelection != 6) {
            switch (userSelection) {
                case 1:
                    addNumber(arrList, scanner);
                    break;
                case 2:
                    printArrayList(arrList);
                    break;
                case 3:
                    getMaximum(arrList);
                    break;
                case 4:
                    getMinimum(arrList);
                    break;
                case 5:
                    getIndexOf(arrList);
                    break;
                default:
                    System.out.println("Invalid input, please try again!");
            }
            printUserMenu();
            userSelection = scanner.nextInt();
        }
        scanner.close();
    }

    private static void getIndexOf(List<Integer> arrList) {
        System.out.println("Please input number: ");
        int num = new Scanner(System.in).nextInt();
        System.out.println("The index is: " + arrList.indexOf(num));
    }

    private static void getMinimum(List<Integer> arrList) {
        int min = arrList.get(0);

        for (Integer num : arrList) {
            min = Math.min(min, num);
        }
        System.out.println("Minimum value is:" + min);
    }

    private static void getMaximum(List<Integer> arrList) {
        int max = arrList.get(0);

        for (Integer num : arrList) {
            max = Math.max(max, num);
        }
        System.out.println("Maximum value is:" + max);
    }

    private static void printArrayList(List<Integer> arrList) {
        System.out.println(Arrays.toString(arrList.toArray()));
    }

    private static void addNumber(List<Integer> arrList, Scanner scanner) {
        System.out.println("Please input number: ");
        arrList.add(scanner.nextInt());
        System.out.println("Your number has been added");
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
