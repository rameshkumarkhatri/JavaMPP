package lesson5.labs.prob2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] arg) {

        List<Calculation> calculations = Arrays.asList(new Circle(2), new Rectangle(2, 4), new Triangle(3, 6));
        double areaSum = 0;
        for (Calculation c : calculations)
            areaSum += c.computeArea();
        System.out.println(String.format("Sum of Areas = %.2f" ,areaSum));

    }
}
