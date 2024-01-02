package lesson_05;

import java.util.Arrays;

public class StringLearning {
    public static void main(String[] args) {
        String myName1 = "Teo"; // Literal declaration (Khai báo tường minh)
        String myName2 = "Teo"; // Literal declaration
        String myName3 = new String("Teo"); // Via String object

        System.out.println(myName1 == myName2); // true. Vì giá trị "Tèo" đều được lưu vô String Pool (nằm trong Java Heap) trong bộ nhớ, myName1 và myName2 cùng refer tới 1 giá trị "Tèo" nên khi so sánh thì sẽ bằng nhau.
        System.out.println(myName1 == myName3); // false. Vì "Tèo" của myName3 được tạo từ object, được lưu trong Java Heap, nên "Tèo" ở 2 nơi khác nhau thì sẽ khác nhau, nên kq là false.
        // Để tránh trường hợp trên, best practice là dùng method equal() khi so sánh String, để chỉ so sánh giá trị của chúng.

        // Check uppercase, lowercase, digit,...
        String myPassword = "123myPassword";
        char[] myCharacters = myPassword.toCharArray();
        int totalDigitChars = 0, totalUpperChars = 0, totalLowerChars = 0;

        for (char character : myCharacters) {
            if (Character.isDigit(character)) totalDigitChars++;
            else if (Character.isUpperCase(character)) totalUpperChars++;
            else if (Character.isLowerCase(character)) totalLowerChars++;
        }

        if (totalUpperChars > 0 && totalLowerChars > 0 && totalDigitChars > 0) {
            System.out.println("You're all set");
        } else {
            System.out.println("Invalid password format!");
        }

        // Immutable: không thay đổi, nhưng khác với final là hoàn toàn không thay đổi, còn immutable thì cho phép clone giá trị ra vùng nhớ khác để thay đổi => giá trị gốc không thay đổi.
        String badWordContainer = "   bad, very bad, sth sth, bad ";
        String filteredStr = badWordContainer.replace("bad", "b**");

        System.out.println(badWordContainer); // bad, very bad, sth sth, bad
        System.out.println(filteredStr); // b**, very b**, sth sth, b**

        // trim()
        System.out.println(badWordContainer.trim()); // "bad, very bad, sth sth, bad"

        // substring(), indexOf()
        System.out.println(badWordContainer.indexOf("♥")); // -1
        System.out.println(badWordContainer.substring(3, 6)); // bad
        System.out.println(badWordContainer.substring(badWordContainer.length() - 4, badWordContainer.length())); // bad

        // split(): return an array of string
        String[] splitStr = badWordContainer.split("");
        System.out.println(Arrays.toString(splitStr)); // [ ,  ,  , b, a, d, ,,  , v, e, r, y,  , b, a, d, ,,  , s, t, h,  , s, t, h, ,,  , b, a, d,  ]

        String[] splitStr2 = badWordContainer.split(",");
        System.out.println(Arrays.toString(splitStr2)); // [   bad,  very bad,  sth sth,  bad ]

        // Regex | Regular Expression
        String myCookingTime = "  105 mins   ";
        String myCookingTimeNum = myCookingTime.replaceAll("[^0-9]", "");
        System.out.println(myCookingTimeNum); // 105

        // TODO: Pattern and Matcher

        int cookingTime = Integer.valueOf(myCookingTimeNum); // 105
        System.out.println("Time: " + (cookingTime + 1)); // 106. Noticed that the brackets have more priority
        System.out.println("Time: " + cookingTime + 1); // 1051. All elements will be converted to string respectively

        // Concatenation
        String s1 = "Hello";
        String s2 = "Nghia";
        System.out.println(s1.concat(s2));
        System.out.println(s1 + s2);

        //StringBuilder
    }
}
