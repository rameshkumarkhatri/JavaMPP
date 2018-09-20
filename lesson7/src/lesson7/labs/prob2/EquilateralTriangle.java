package lesson7.labs.prob2;

public class EquilateralTriangle implements ClosedCurve {

    private double triangleLength;

    EquilateralTriangle(double triangleLength) {
        this.triangleLength = triangleLength;
    }

    @Override
    public double[] getSides() {
        return new double[]{triangleLength};
    }

    @Override
    public double computePerimeter() {
        return 3*triangleLength;
    }
}
