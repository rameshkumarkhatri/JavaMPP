package lesson8.lab.prob1.prob_j;

import java.util.function.Supplier;

public class J {

    public static void main(String[] arg) {
//    this is solution of part ii
        Supplier<Double> doubleSupplier = Math::random;
        System.out.println(doubleSupplier.get());

        //    this is solution of part iii
        RandomGenerator randomGenerator = (new J()).new RandomGenerator();
        System.out.println(randomGenerator.get());

        randomUsingLambda();
    }
    //    this is solution of part iii
    class RandomGenerator implements Supplier<java.lang.Double> {

        @Override
        public java.lang.Double get() {
            return Math.random();
        }
    }

//    this is solution of part i
    public static void randomUsingLambda() {
        Supplier<Double> doubleSupplier = () -> Math.random();
        System.out.println(doubleSupplier.get());
    }
}
