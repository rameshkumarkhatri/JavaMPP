package lesson9.labs.prob11b;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

    public static final TriFunction<List<Employee>, Integer, Character, List<String>> NAME_100K =  (employees, salary, character) ->
            employees.stream()
                    .filter(emp -> (emp.getSalary() > salary && emp.getLastName().charAt(0) > character))
                    .sorted(Comparator.comparing(Employee::getFirstName))
                    .map(e -> e.getFirstName() + " " + e.getLastName())
                    .sorted().collect(Collectors.toList());

}
