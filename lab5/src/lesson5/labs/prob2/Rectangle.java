package lesson5.labs.prob2;

public final class Rectangle implements Calculation {
    private final double length;
    private final double width;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double computeArea() {
        return width * length;
    }
}
