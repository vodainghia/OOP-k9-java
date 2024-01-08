package labs.lab_09;

public class ContractEmployee extends Employee {
    private static final int CONTRACTOR_EMPLOYEE_SALARY = 40000;

    @Override
    public int getSalary() {
        return CONTRACTOR_EMPLOYEE_SALARY;
    }
}
