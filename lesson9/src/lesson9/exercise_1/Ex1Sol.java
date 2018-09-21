package lesson9.exercise_1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1Sol {

    public static void main(String[] arg) {
        Stream<Integer> stream = Stream.iterate(1, n-> n+2);
//        stream.limit(20).forEach(System.out::println);

//        stream.skip(4).limit(4).forEach(System.out::println);
            //OR
        stream.limit(8).skip(4).forEach(System.out::println);
    }
}
