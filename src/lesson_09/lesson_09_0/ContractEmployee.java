package lesson_09.lesson_09_0;

public class ContractEmployee extends Employee {
    private static final int CONTRACTOR_EMPLOYEE_SALARY = 40000;

    public ContractEmployee() {
        super(CONTRACTOR_EMPLOYEE_SALARY);
    }
}
