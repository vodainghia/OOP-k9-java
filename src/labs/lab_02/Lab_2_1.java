package labs.lab_02;
/*
Get input from user about height(m) and weight(kg) then calculate BMI
        Underweight = <18.5
        Normal weight = 18.5 – 24.9
        Overweight = 25–29.9
        Obesity = BMI of 30 or greater
BMI = weight / (height x 2)
*/
import java.util.Scanner;

public class Lab_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your height (m): ");
        float height = scanner.nextFloat();
        System.out.print("Please input your weight (kg): ");
        float weight = scanner.nextFloat();

        float BMI = weight / (height * height);

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI <= 24.9) {
            System.out.println("Normal weight");
        } else if (BMI <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}
