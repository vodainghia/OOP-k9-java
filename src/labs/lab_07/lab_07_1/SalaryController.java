package labs.lab_07.lab_07_1;

import java.util.List;

public class SalaryController {
    public int calcTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.calcSalary();
        }
        return totalSalary;
    }
}
