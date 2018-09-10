package lesson5.labs.prob2;

public final class Triangle implements Calculation {
    private final double base;
    private final double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double computeArea() {
        return 0.5 * base * height;
    }
}