package lesson9.labs.Prob5;

import java.util.*;
import java.util.function.Function;

public class EmployeeInfoBestSolution {
    static enum SortMethod {BYNAME, BYSALARY};
    static Function<Employee, String> byName = e -> e.getName();
    static Function<Employee, Integer> bySalary = e -> -e.getSalary();



    static HashMap<SortMethod, Comparator<Employee>> map = new HashMap<>();
    
    static {
        map.put(SortMethod.BYNAME, Comparator.comparing(byName).thenComparing(bySalary));
        map.put(SortMethod.BYSALARY, Comparator.comparing(bySalary).thenComparing(byName));
    }
    
    
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Joe", 100000));
        emps.add(new Employee("Tim", 50000));
        emps.add(new Employee("Rick", 50000));
        emps.add(new Employee("Andy", 60000));
        emps.add(new Employee("Tim", 10000));
        EmployeeInfoBestSolution ei = new EmployeeInfoBestSolution();
        emps.sort(map.get(SortMethod.BYNAME));
        System.out.println(emps);
        emps.sort(map.get(SortMethod.BYSALARY));
        System.out.println(emps);

        System.out.println("Best solution by pair");
        ei.properSolution();
    }

    static class Pair<S, T> {
        S first;
        T second;

        Pair(S s, T t){
            this.first = s;
            this.second = t;
        }
    }


    final HashMap<SortMethod, Pair<Function, Function>> map1 = new HashMap<SortMethod, Pair<Function, Function>>() {
        {
            put(SortMethod.BYNAME, new Pair<Function, Function>(byName, bySalary));
            put(SortMethod.BYSALARY, new Pair<Function, Function>(bySalary, byName));
        }
    };
    public  void properSolution () {



        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Joe", 100000));
        emps.add(new Employee("Tim", 50000));
        emps.add(new Employee("Rick", 50000));
        emps.add(new Employee("Andy", 60000));
        emps.add(new Employee("Tim", 10000));

        sortList(emps, SortMethod.BYNAME);
        System.out.println(emps); sortList(emps, SortMethod.BYSALARY);
        System.out.println(emps);

    }

    private  void sortList(List<Employee> emps, SortMethod name) {
        emps.sort(Comparator.comparing(map1.get(name).first).thenComparing(map1.get(name).second,Comparator.reverseOrder()));
    }

    //[<name: Andy salary: 60000>, <name: Joe salary: 100000>, <name: Rick salary: 50000>, <name: Tim salary: 50000>, <name: Tim salary: 10000>]
    //            [<name: Joe salary: 100000>, <name: Andy salary: 60000>, <name: Rick salary: 50000>, <name: Tim salary: 50000>, <name: Tim salary: 10000>]
}

