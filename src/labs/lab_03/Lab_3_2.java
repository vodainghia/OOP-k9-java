package labs.lab_03;

public class Lab_3_2 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int min = intArr[0], max = intArr[0];

        for (int i : intArr) {
            min = min > i ? i : min;
            max = max < i ? i : max;
        }

        System.out.println("Min value of this integer array is: " + min);
        System.out.println("Max value of this integer array is: " + max);
    }
}
