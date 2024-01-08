package lesson_09.lesson_09_1;

public class Employee {
    private int salary;

    public Employee() {
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Better design, but still have to force to override method => Better solution: Apply Abstraction in OOP
    public int getAllowance() {
        return 0;
    }
}
