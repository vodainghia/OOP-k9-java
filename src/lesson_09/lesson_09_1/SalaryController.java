package lesson_09.lesson_09_1;

import java.util.List;

public class SalaryController {
    public int calcTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary() + employee.getAllowance();
        }
        return totalSalary;
    }
}
