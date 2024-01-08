package lesson_09.lesson_09_2;

public class FulltimeEmployee extends Employee {
    private static final int FULLTIME_EMPLOYEE_SALARY = 50000;
    private static final int FULLTIME_EMPLOYEE_ALLOWANCE = 4000;

    @Override
    public int getSalary() {
        return FULLTIME_EMPLOYEE_SALARY;
    }

    @Override
    public int getAllowance() {
        return FULLTIME_EMPLOYEE_ALLOWANCE;
    }
}
