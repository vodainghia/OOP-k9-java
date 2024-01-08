package lesson_09.lesson_09_2;

import java.util.List;

public class SalaryController {
    // Is-A relationship
    public int calcTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary() + employee.getAllowance();
        }
        return totalSalary;
    }
}
