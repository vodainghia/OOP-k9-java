package lesson_02;

public class BitwiseOperator {
    public static void main(String[] args) {
//        if (firstMethod() && secondMethod()) {
//            System.out.println("Inside the if 1");
//        }

        if (firstMethod() & secondMethod()) {
            System.out.println("Inside the if 2");
        }
    }

    public static boolean firstMethod() {
        System.out.println("firstMethod");
        return true;
    }

    public static boolean secondMethod() {
        System.out.println("secondMethod");
        return true;
    }
}
