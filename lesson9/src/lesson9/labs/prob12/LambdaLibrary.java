package lesson9.labs.prob12;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

    public static final TriFunction<List<Employee>, Integer, Character, Long> COUNT_EMPLOYEES = (employees, salary, character) ->
            employees.stream()
                    .filter(emp -> (emp.getSalary() > salary && emp.getLastName().charAt(0) > character)).count();
    public static final TriFunction<List<Employee>, Integer, Character, List<String>> SALARY_FIRST_NAME = (employees, salary, character) ->
            employees.stream()
                    .filter(emp -> (emp.getSalary() > salary && emp.getFirstName().charAt(0) < character))
                    .map(employee -> (employee.getFirstName() + " " + employee.getLastName()).toUpperCase())
                    .sorted().collect(Collectors.toList());

}
