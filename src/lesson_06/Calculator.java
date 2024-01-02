package lesson_06;

public class Calculator {
    // Method Overloading
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sum(int num1, int num2, int sum3) {
        return num1 + num2 + sum3;
    }

    // Varargs | Rest parameters
    public int sum(int... restNumbers) {
        int totalNum = 0;
        for (int num : restNumbers) {
            totalNum += num;
        }
        return totalNum;
    }

    // WHEN Overloading happens? => Compile time, khi biên dịch chương trình là đã xảy ra
    // WHEN Overriding happens? => Run time, khi new object thì mới xảy ra
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.sum(1, 2, 3, 4, 5));
    }
}
