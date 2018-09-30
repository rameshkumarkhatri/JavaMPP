package lesson9.labs.prob9;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] arg) {
        printSquares(4);
        prob10A();
        prob10B();
        prob10C();
    }
    public static void printSquares(int num) {

        System.out.println(Stream.iterate(1, x -> computeSquare(x+1)).limit(num).collect(Collectors.toList()));
    }

    private static Integer computeSquare(int i) {
        if(((int)Math.sqrt(i)) * ((int)Math.sqrt(i)) == i)
        return i;
        else return computeSquare(i+1);
    }


    public static void prob10A() {
        IntStream ones = IntStream.generate(() -> 1).limit(1).distinct();
        ones.forEach(System.out::println);
    }
    public static void prob10B() {
        System.out.println(Stream.of( "Bill",
                "Thomas", "Mary").reduce((s, s2) -> s+", "+s2).get().toString());
    }

    public static void prob10C() {

        IntStream myIntStream = IntStream.of(1,2,-344,90);
        IntSummaryStatistics statistics = myIntStream.summaryStatistics();
        System.out.println("Min : "+statistics.getMin()+" || Max : "+statistics.getMax());
    }


}
