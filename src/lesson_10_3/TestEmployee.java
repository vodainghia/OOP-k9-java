package lesson_10_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestEmployee {

    public static void main(String[] args) {
        Employee teo = new Employee("Teo", 10);
        teo.setAge(21);
        Employee ti = new Employee("Ti", 11);
        ti.setAge(20);
        Employee tun = new Employee("Tun", 7);
        tun.setAge(18);

        List<Employee> employees = Arrays.asList(teo, ti, tun);
        System.out.println("Before sorting");
        System.out.println(employees);

        Collections.sort(employees);

        System.out.println("After sorting");
        System.out.println(employees);

        employees.sort(new EmpAgeComparator());
        System.out.println(employees);
    }
}
