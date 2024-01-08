package lesson_09.lesson_09_0;

public class FulltimeEmployee extends Employee {
    private static final int FULLTIME_EMPLOYEE_SALARY = 50000;

    public FulltimeEmployee() {
        super(FULLTIME_EMPLOYEE_SALARY);
    }

    // Bad design
    public int getAllowance() {
        return 4000;
    }
}
