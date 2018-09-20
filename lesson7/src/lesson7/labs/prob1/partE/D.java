package lesson7.labs.prob1.partE;

public interface D extends C, B {

    @Override
    default void method() {
        System.out.println("D");
    }
}
