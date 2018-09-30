package lesson11.labs.prob7.mystream_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyStream<T> {
    private List<T> elements;

    public static <T> MyStream<T> of(List<T> aList) {
        //implement
        return new MyStream(aList);
    }

    private MyStream(List<T> aList) {
        //implement
        this.elements = aList;
    }

    public static <S> MyStream<S> concat(MyStream<S> s1, MyStream<S> s2) {
        //implement
        List<S> list = s1.elements;
        list.addAll(s2.elements);
        return MyStream.of(list);
    }

    public <R> MyStream<R> flatMap(Function<T, MyStream<R>> mapper) {
        //implement
        List<R> list = new ArrayList<>();
        for (T t : this.elements)
            list.addAll(mapper.apply(t).elements);
        return MyStream.of(list);
    }

    public List<T> asList() {
        //implement
        return this.elements;
    }

    public <R> MyStream<R> map(Function<T, R> mapper) {
        //implement
        List<R> list = new ArrayList<>();
        for (T t : this.elements)
            list.add(mapper.apply(t));
        return MyStream.of(list);
    }

    public MyStream<T> filter(Predicate<T> predicate) {
        //implement
        List<T> list = new ArrayList<>();
        for (T t : this.elements)
            if (predicate.test(t))
                list.add(t);
        return MyStream.of(list);
    }
}
