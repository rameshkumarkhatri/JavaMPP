package lesson8.lab.prob1.prob_h;

import java.util.function.Consumer;

public class H {

    public void lambdaConvert(){
        //        System.out::println

        // lambda
        Consumer<String> consumer = (s)-> System.out.println(s);

        consumer.accept("This is object method reference, because System.out is public static object in System class and we are calling its method println");

    }
}
