package lesson8.excercise;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;

public class Evaluator {
    public static void main(String[] arg) {
        evaluator();
    }
    public static void evaluator() {
//        (String x) -> x.toUpperCase()
        Function<String, String> toUpper1 = (String x) -> x.toUpperCase();
        Function<String, String> toUpper2 = String::toUpperCase;
//        A. (Employee e) -> e.getName();
//        Function<T,R> : Represents a function that accepts one argument and produces a result.
        Function<Employee, String> name = (Employee e) -> e.getName();
        Function<Employee, String> name1 = Employee::getName;
        Function<Employee, String> name2 = employee -> employee.getName();



//        B.  (Employee e,String s) -> e.setName(s)
//        BiConsumer<T,U> : Represents an operation that accepts two input arguments and returns no result.
        BiConsumer<Employee, String> biConsumer = (x, y) -> x.setName(y);
        BiConsumer<Employee, String> biConsumer1 = Employee::setName;
        BiConsumer<Employee, String> biConsumer2 = (a,b) -> {
                a.setName(b);
        };


//        C. (String s1,String s2) -> s1.compareTo(s2)
        Comparator<String>  comparator = (x, y) -> x.compareTo(y);
        Comparator<String>  comparator1 = String::compareTo;



//        D. (Integer x,Integer y) -> Math.pow(x,y)
//        BiFunction<T,U,R> : Represents a function that accepts two arguments and produces a result.
        BiFunction<Integer, Integer, Double> power = (x, y) -> Math.pow((double)x,(double)y);
        BiFunction<Integer, Integer, Double> power1 = new BiFunction<Integer, Integer, Double>() {
            @Override
            public Double apply(Integer integer, Integer integer2) {
                return Math.pow(integer, integer2);
            }
        };

//                    OR

        ToDoubleBiFunction<Integer, Integer> power3 = (x, y) -> Math.pow(x,y);
        ToDoubleBiFunction<Integer, Integer> power4 = Math::pow;


//        E. (Apple a) -> a.getWeight()
//        Function<T,R> : Represents a function that accepts one argument and produces a result.
        Function<Apple, Double > weight = Apple::getWeight;
        Function<Apple, Double > weight1 = (Apple a) -> a.getWeight();

//        F. (String x) -> Integer.parseInt(x);

        Function<String, Integer> integerFunction = Integer::parseInt;
        Function<String, Integer> integerFunction1 = ((String s) -> Integer.parseInt(s));


//        G. EmployeeNameComparator comp = new EmployeeNameComparator();
//        (Employee e1, Employee e2) -> comp.compare(e1,e2)

//        Comparator<Employee> employeeComparator = (o1, o2) -> {
//            return o1.compareTo(o2);
//        };
//        Comparator<Employee> employeeComparator1 = Employee::compareTo;

        EmployeeNameComparator comp = new EmployeeNameComparator();
        Comparator<Employee> employeeComparator = (o1, o2) -> {
            return comp.compare(o1,o2);
        };
//        Comparator<Employee> employeeComparator1 = Employee::compareTo;


        System.out.println(toUpper2.apply("hello"));
        name.apply(new Employee("ramesh", 1));
        Employee e = new Employee("Ramesh$", 11);
        biConsumer.accept(e, "Dil");
        System.out.println("Comparator result ramesh kumar "+comparator1.compare("ramesh", "kumar"));
        System.out.println("Power result 2,3"+power.apply(2,3));
        System.out.println("Apple weight = "+weight.apply(new Apple()));
        System.out.println("Parse integer = "+integerFunction.apply("10"));
        System.out.println("Employee comparator = "+employeeComparator.compare(new Employee("raja",10), new Employee("raja", 10)));



    }
}
