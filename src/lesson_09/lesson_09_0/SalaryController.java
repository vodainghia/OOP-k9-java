package lesson_09.lesson_09_0;

import java.util.List;

public class SalaryController {
    public int calcTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {

            // Casting | BAD practice | NOT recommend
            if (employee instanceof FulltimeEmployee) {
                totalSalary += employee.getSalary() + ((FulltimeEmployee) employee).getAllowance();
            } else {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }
}
