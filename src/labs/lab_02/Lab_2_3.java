package labs.lab_02;
/*
Get input from user about height(m) and weight(kg) then calculate BMI
        Underweight = <18.5
        Normal weight = 18.5 – 24.9
        Overweight = 25–29.9
        Obesity = BMI of 30 or greater
BMI = weight / (height x 2)
Suggest user to increase/decrease weight
*/

import java.util.Scanner;

public class Lab_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your height (m): ");
        float height = scanner.nextFloat();
        System.out.print("Please input your weight (kg): ");
        float weight = scanner.nextFloat();

        float BMI = BMICalc(weight, height);

        String result = getBMI(BMI);
        System.out.println(result);

        float changeWeight = changeWeightCalc(weight, height, BMI);

        if (changeWeight != 0) {
            System.out.printf("You should to %s %.2f(kg).", changeWeight > 0 ? "increase" : "decrease", Math.abs(changeWeight));
        }
    }

    public static String getBMI(float BMI) {
        if (BMI < 18.5) {
            return "Underweight.";
        } else if (BMI <= 24.9) {
            return "Normal weight.";
        } else if (BMI <= 29.9) {
            return "Overweight.";
        } else {
            return "Obesity.";
        }
    }

    public static float changeWeightCalc(float weight, float height, float BMI) {
        if (BMI < 18.5) {
            return (float) (18.5 * height * height) - weight;
        } else if (BMI > 24.9) {
            return (float) (24.9 * height * height) - weight;
        }

        return 0;
    }

    public static float BMICalc(float weight, float height) {
        return weight / (height * height);
    }
}
