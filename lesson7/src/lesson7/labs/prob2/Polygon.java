package lesson7.labs.prob2;

public interface Polygon {

    double[] getSides();

    public default double computePerimeter(){
        double[] sides = getSides();
        double sideSum = 0;
        for(double side : sides)
            sideSum+=side;
        return sideSum;
    }
}
