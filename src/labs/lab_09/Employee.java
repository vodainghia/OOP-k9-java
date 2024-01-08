package labs.lab_09;

public abstract class Employee {
    private int salary;

    public Employee() {
    }

    // Apply Abstraction
    public abstract int getSalary();

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
