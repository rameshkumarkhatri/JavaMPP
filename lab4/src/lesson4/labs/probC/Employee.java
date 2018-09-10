package lesson4.labs.probC;

public abstract class Employee {

    int empId;

    public void print(int month, int year){
        calculateCompensation(month, year).print();
    }

    public Paycheck calculateCompensation(int month, int year) {
        double grossSalary = calGrossSalary(month, year);

//        double netSalary = grossSalary - (TAX.FICA.calculateTax(grossSalary) + TAX.STATE_TAX.calculateTax(grossSalary)
//                + TAX.LOCAL_TAX.calculateTax(grossSalary) + TAX.MEDICARE.calculateTax(grossSalary)
//                + TAX.SOCIAL_SECURITY.calculateTax(grossSalary));
        Paycheck paycheck = new Paycheck(grossSalary);
        return paycheck;
    }

    public abstract double calGrossSalary(int month, int year);



}
