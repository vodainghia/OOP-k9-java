package lesson_13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestEmployeeDataFactory {

    public static void main(String[] args) {
        // READING
        String relativeFilePath = "/src/lesson_13/Persons.txt";
        String absoluteFilePath = System.getProperty("user.dir").concat(relativeFilePath);

        List<Employee> employeeList = EmployeeDataFactory.getEmployeeListFromFile(absoluteFilePath);
        Collections.sort(employeeList);
        System.out.println(employeeList);

        // WRITING
        Employee bi = new Employee("bi", 21, 70000);
        Employee bo = new Employee("bo", 30, 140000);
        Employee bun = new Employee("bun", 25, 95000);
        String employeeDBFile = System.getProperty("user.dir").concat("/src/lesson_13/EmployeeDB.txt");
        EmployeeDataFactory.saveEmployeeList(Arrays.asList(bi, bo, bun), employeeDBFile);
    }
}
