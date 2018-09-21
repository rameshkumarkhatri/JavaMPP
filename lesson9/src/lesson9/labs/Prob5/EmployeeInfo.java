package lesson9.labs.Prob5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class EmployeeInfo {
    static enum SortMethod {BYNAME, BYSALARY};
    static Function<Employee, String> byName = e -> e.getName();
    static Function<Employee, Integer> bySalary = e -> -e.getSalary();

    static HashMap<SortMethod, Comparator<Employee>> map = new HashMap<>();

    static {
        map.put(SortMethod.BYNAME, Comparator.comparing(byName));
        map.put(SortMethod.BYSALARY, Comparator.comparing(bySalary));
    }


    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Joe", 100000));
        emps.add(new Employee("Tim", 50000));
        emps.add(new Employee("Rick", 50000));
        emps.add(new Employee("Andy", 60000));
        emps.add(new Employee("Tim", 10000));
        EmployeeInfo ei = new EmployeeInfo();
        emps.sort(map.get(SortMethod.BYNAME));
        System.out.println(emps);
        emps.sort(map.get(SortMethod.BYSALARY));
        System.out.println(emps);
    }

//[<name: Andy salary: 60000>, <name: Joe salary: 100000>, <name: Rick salary: 50000>, <name: Tim salary: 50000>, <name: Tim salary: 10000>]
//			[<name: Joe salary: 100000>, <name: Andy salary: 60000>, <name: Rick salary: 50000>, <name: Tim salary: 50000>, <name: Tim salary: 10000>]
}
