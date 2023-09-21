package lesson_02;

public class OperatorsLearning {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        int total = myNum1 + myNum2;
        System.out.println("Total: " + total);

        int multiple = myNum1 * myNum2;

        int x = ++myNum1 + myNum2++;
        System.out.println("x:" + x);
        System.out.println("myNum1: " + myNum1);
        System.out.println("myNum2: " + myNum2);

        // console log có format
        System.out.printf("\t\t%b + %d + %f = %s\n", true, 1, 3.14, "right operand");
    }
}
