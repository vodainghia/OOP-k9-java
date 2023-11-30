package lesson_04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();

        //CRUD
        myArrList.add(1);
        myArrList.add(1, 2);

        for (int i = 0; i < myArrList.size(); i++) {
            System.out.println(myArrList.get(i));
        }

        for (int integer : myArrList) {
            System.out.println(integer);
        }
    }
}
