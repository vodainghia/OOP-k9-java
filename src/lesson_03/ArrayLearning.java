package lesson_03;

public class ArrayLearning {
    public static void main(String[] args) {
        int arrayLength = 5;
        int[] myIntArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            myIntArray[i] = i++;
        }

        for (int i = 0; i < arrayLength; i++) {
            System.out.println(myIntArray[i]);
        }
    }
}
