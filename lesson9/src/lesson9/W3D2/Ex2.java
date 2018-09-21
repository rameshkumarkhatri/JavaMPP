package lesson9.W3D2;

import java.util.stream.Stream;

public class Ex2 {

    public static void main(String[] arg) {

//        Describe below
        Stream stream = Stream.generate(() -> 1);
        stream.forEach(System.out::println);

        Stream stream2 = Stream.generate(() -> 1).distinct();
        stream2.forEach(System.out::println);

    }
}
