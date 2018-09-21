package lesson9.labs.prob4;

import java.math.BigInteger;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prob4B {

    public static void main(String []arg){
        PrimeStream ps = new Prob4B().new PrimeStream(); //PrimeStream is enclosing class
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }

     class PrimeStream {

        // ======= GOOD ======

        final Function<Integer, Stream<Integer>> integerListFunction = integer -> Stream.iterate(2, x -> Integer.parseInt(new BigInteger(String.valueOf(x+1)).nextProbablePrime().toString())).limit(integer);

        public void printFirstNPrimes(int n) {

            System.out.println(integerListFunction.apply(n).collect(Collectors.toList()));

        }
        // ======= GOOD ENDS =====


//=======================BAD ===========
        final Stream<Integer> integerStream = Stream.iterate(2, x -> Integer.parseInt(new BigInteger(String.valueOf(x+1)).nextProbablePrime().toString()));
        //            System.out.println(getIntegerStream().limit(n).collect(Collectors.toList()));/
        public Stream<Integer> getIntegerStream() {
            return Stream.iterate(2, x -> Integer.parseInt(new BigInteger(String.valueOf(x+1)).nextProbablePrime().toString()));
        }
    }
}
