package labs.lab_03;

import java.util.Arrays;

public class Lab_3_4 {
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length || j < right.length) {
            if (i < left.length && (j == right.length || left[i] < right[j])) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] intArr1 = {1, 12, 16, 28, 34};
        int[] intArr2 = {1, 13, 16, 27, 99};

        System.out.println(Arrays.toString(merge(intArr1, intArr2)));
    }
}
