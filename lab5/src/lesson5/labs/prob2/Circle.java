package lesson5.labs.prob2;

public final class Circle implements Calculation {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}