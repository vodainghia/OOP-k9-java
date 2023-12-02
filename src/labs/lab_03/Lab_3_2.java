package labs.lab_03;

public class Lab_3_2 {
    public static void main(String[] args) {
        int[] intArr = {2, 1, 3, 5, 4};
        int min = intArr[0], max = intArr[0];

        for (int i : intArr) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        System.out.println("Min value of this integer array is: " + min);
        System.out.println("Max value of this integer array is: " + max);
    }
}
