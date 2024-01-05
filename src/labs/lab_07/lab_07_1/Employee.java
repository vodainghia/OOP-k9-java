package labs.lab_07.lab_07_1;

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

    public int calcSalary() {
        return this.salary;
    }
}
