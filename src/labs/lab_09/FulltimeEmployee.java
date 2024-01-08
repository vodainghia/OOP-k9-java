package labs.lab_09;

public class FulltimeEmployee extends Employee {
    private static final int FULLTIME_EMPLOYEE_SALARY = 50000;

    @Override
    public int getSalary() {
        return FULLTIME_EMPLOYEE_SALARY;
    }
}
