package lesson_04;

public class ArrayPostfixPrefix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = ++a + b++;
        int[] myIntArray = new int[5];

//        for (int index = 0; index < 5; index++) {
//            myIntArray[index] = index + 2;
//        }

        for (int index = 0; index < 5;) {
            myIntArray[index++] = index + 1;
            // nó sẽ gán index = index + 1 trước. Lúc này myIntArray[0] = 1.
            // Sau đó, sẽ tới lượt Postfix, index++, lúc này giá trị thực của index đã từ 0 thành 1 để dùng cho vòng lặp tiếp theo.
        }

        for (int value : myIntArray) {
            System.out.println(value);
        }
    }
}
