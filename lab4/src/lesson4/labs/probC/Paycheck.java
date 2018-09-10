package lesson4.labs.probC;

public class Paycheck {
    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;


//    public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
//        this.grossPay = grossPay;
//        this.fica = fica;
//        this.state = state;
//        this.local = local;
//        this.medicare = medicare;
//        this.socialSecurity = socialSecurity;
//    }

    Paycheck(double grossPay) {
        this.grossPay = grossPay;
        fica = TAX.FICA.calculateTax(grossPay);
        state = TAX.STATE_TAX.calculateTax(grossPay);
        local = TAX.LOCAL_TAX.calculateTax(grossPay);
        medicare = TAX.MEDICARE.calculateTax(grossPay);
        socialSecurity = TAX.SOCIAL_SECURITY.calculateTax(grossPay);


    }

    public void print() {
        System.out.println("Gross pay : "+grossPay+"\t net pay : "+getNetPay()
                +"\n\tfica = "+fica
                +"\n\tstate = "+state
                +"\n\tlocal = "+local
                +"\n\tmedicare = "+medicare
                +"\n\tsocialSecurity = "+socialSecurity);
    }

    public double getNetPay() {
        double netPay = grossPay - fica - state - local - medicare - socialSecurity;
        return netPay;
    }

    enum TAX {

        FICA(23), STATE_TAX(5), LOCAL_TAX(1), MEDICARE(3), SOCIAL_SECURITY(7.5);

        private double value;

        TAX(double value){
            this.value = value;
        }

        public double getValue(){return this.value;}

        public double calculateTax(double grossSalary) {
            return (this.value *grossSalary)/100 ;
        }
    }

}
