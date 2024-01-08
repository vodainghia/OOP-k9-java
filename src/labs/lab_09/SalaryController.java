package labs.lab_09;

import java.util.List;

public class SalaryController {
    public int calcTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}
