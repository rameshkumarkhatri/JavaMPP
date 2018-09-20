package lesson7.labs.prob1.partE;

public interface B extends A {
    //abstract void method();

    @Override
    default void method() {
        System.out.println("B");
    }
}
