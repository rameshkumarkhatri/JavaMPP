package lesson7.labs.prob2;

public class Ellipse implements ClosedCurve {

    private double a, E;

    Ellipse(double a, double E) {
        this.a = a;
        this.E = E;
    }

    @Override
    public double[] getSides() {
        return new double[]{a, E};
    }

    @Override
    public double computePerimeter() {
        return 3 * a * E;
    }


}
