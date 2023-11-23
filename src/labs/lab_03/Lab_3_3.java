package labs.lab_03;

import java.util.Arrays;

public class Lab_3_3 {
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

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
        int[] intArr = {12, 34, 1, 16, 28};

        System.out.println(Arrays.toString(mergeSort(intArr)));
        //Arrays.stream(mergeSort(intArr)).forEach(System.out::println);
    }
}
