package labs.lab_03;

public class Lab_3_1 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int oddQuantity = 0;
        int evenQuantity = 0;

        for (int ele : intArr) {
            if ((ele & 1) == 0) evenQuantity += 1;
            else oddQuantity += 1;
        }

        System.out.printf("There are %d odd and %d even in the integer array", oddQuantity, evenQuantity);
    }
}
