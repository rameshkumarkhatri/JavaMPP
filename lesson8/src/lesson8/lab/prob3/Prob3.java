package lesson8.lab.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Prob3 {

    public static void main(String[] arg) {
       BiFunction<Double, Double, List<Double> > function = (x,y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x * y);
            return list;
        };
       function.apply(2.0,3.0).forEach(System.out::println);
    }
}
