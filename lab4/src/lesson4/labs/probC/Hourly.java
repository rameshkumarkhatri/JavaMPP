package lesson4.labs.probC;

public class Hourly extends Employee {
    final double hourlyWage;
    final double hoursPerWeek;

    Hourly(int id, double hourlyWage, double hoursPerWeek) {
        this.empId = id;
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calGrossSalary(int month, int year) {
        return hourlyWage * hoursPerWeek * 4;
    }

}
