package lesson_07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndObject {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person teo = new Person();
        teo.setName("Teo");
        teo.setAge(18);

        personList.add(teo);
        personList.add(teo);

        System.out.println(personList);

        personList.get(1).setName("Ti");
        System.out.println(personList);
    }
}
