package lesson_09.lesson_09_2;

public class ContractEmployee extends Employee {
    private static final int CONTRACTOR_EMPLOYEE_SALARY = 40000;
    @Override
    public int getSalary() {
        return CONTRACTOR_EMPLOYEE_SALARY;
    }

    @Override
    public int getAllowance() {
        return 0;
    }
}
