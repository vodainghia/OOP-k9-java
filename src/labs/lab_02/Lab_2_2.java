package labs.lab_02;
// Allow user to input a number, print out it’s an odd or even number
import java.util.Scanner;

public class Lab_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int inputNumber = scanner.nextInt();

        String outMsg = inputNumber % 2 == 0 ? "It's an even number" : "It's an odd number";
        System.out.println(outMsg);
    }
}
