package lesson_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        List<Integer> myArrList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> myArrList2 = new ArrayList<>();

        myArrList2.add(1);
        myArrList2.add(2);
        myArrList2.add(3);
        myArrList2.add(4);

        for (int index = 0; index < myArrList.size(); index++) {
            boolean isOddNumber = (myArrList.get(index) ^ 1) == 1;
            if (isOddNumber) {
                myArrList.set(index, myArrList.get(index) + 1);
            }
        }

        // Sẽ lỗi UnsupportedOperationException vì Arrays.asList là một list cứng, chỉ có thể read, update; không thể add, remove.
//        myArrList.remove(1);
//        myArrList.remove(new Integer(1));

        System.out.println(myArrList.isEmpty());
        System.out.println(myArrList.contains(6));
        System.out.println(myArrList.indexOf(3));
    }
}
