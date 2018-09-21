package lesson9.labs.prob4;

import java.math.BigInteger;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prob4A {
    // BY PRADICATE
    final Stream<Integer> prime = Stream.iterate(2, integer -> nextPrime(integer+1)).limit(10);

//    BY BIG INTEGER METHOD
    final Stream<Integer> primeSecond = Stream.iterate(2, Prob4A::apply).limit(10);

    private static Integer apply(Integer integer) {
        return Integer.parseInt(new BigInteger(integer.toString()).nextProbablePrime().toString());
    }

    private int nextPrime(Integer integer) {
        if(isPrime(integer)) return integer;
        else return nextPrime(integer+1);
    }
    private static boolean isPrime(int number) {
        IntPredicate isDivisible = index -> number % index == 0;
        return number > 1 && IntStream.range(2, number - 1).noneMatch(isDivisible);
    }


    public static void main(String[] arg) {
       Prob4A prob4 = new Prob4A();
       prob4.primeSecond.forEach(System.out::println);
       prob4.prime.forEach(System.out::println);
    }
}
