package lesson_12;

// Un-expected
public class Calculator {
    public int divide(int a, int b) {
        // Solution 1
        if (b == 0) {
            throw new IllegalArgumentException("The second number can't be zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(new Calculator().divide(4, 2));
            System.out.println(new Calculator().divide(4, 0));
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            throw new IllegalArgumentException("Khong truyen so 0.");
        } finally {
            System.out.println("See you again");
        }
    }
}
