package labs.lab_09;

import java.util.Arrays;

public class TestEmployee {
    public static void main(String[] args) {
        Employee man1 = new FulltimeEmployee();
        Employee man2 = new FulltimeEmployee();
        Employee man3 = new FulltimeEmployee();
        Employee man4 = new ContractEmployee();
        Employee man5 = new ContractEmployee();

        int totalSalary = 0;
        SalaryController salaryController = new SalaryController();
        totalSalary = salaryController.calcTotalSalary(Arrays.asList(man1, man2, man3, man4, man5));
        System.out.println(totalSalary);
    }
}
