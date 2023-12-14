package lesson_05;

import java.util.*;

public class RemovingDuplicatedValues {
    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(4);
        myArrList.add(1);
        myArrList.add(5);
        myArrList.add(2);
        myArrList.add(4);
        myArrList.add(3);

        /*
        * Lấy 3 giá trị nhỏ nhất của arraylist
        * (không trùng giá trị)
        * */

        // Lọc dữ liệu bị trùng trong List
        // Cách ngắn hơn là dùng Set
        List<Integer> withoutDuplicatedValuesList = new ArrayList<>();

        for (Integer num : myArrList) {
            if (!withoutDuplicatedValuesList.contains(num)) {
                withoutDuplicatedValuesList.add(num);
            }
        }

        Collections.sort(withoutDuplicatedValuesList);
        System.out.println(withoutDuplicatedValuesList);

        // Set
        // Set cũng đồng thời sort dữ liệu lúc lấy từ List luôn
//        Set<Integer> set = new HashSet<>(myArrList);
//        myArrList = new ArrayList<>(set);
//        System.out.println(set);
//        System.out.println(myArrList);

        // Sublist
        List<Integer> firstThreeMinValues = withoutDuplicatedValuesList.subList(0, 3); // Tuy lấy ra 3 giá trị index 0, 1, 2 nhưng phải nhập toIndex = 3 vì cách dùng ở đây là exclusive
        System.out.println(firstThreeMinValues);
    }
}
