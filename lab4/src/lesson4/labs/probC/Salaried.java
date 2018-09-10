package lesson4.labs.probC;

public class Salaried extends Employee {

    private final double salary;

    Salaried(int id, double salary) {
        this.salary = salary;
        this.empId = id;
    }

    @Override
    public double calGrossSalary(int month, int year) {
        return salary;
    }
}
