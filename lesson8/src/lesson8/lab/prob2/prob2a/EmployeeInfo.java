package lesson8.lab.prob2.prob2a;

import lesson8.lecture.comparator2.Employee;
import lesson8.lecture.comparator2.EmployeeNameComparator;
import lesson8.lecture.comparator2.EmployeeSalaryComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
    static enum SortMethod {BYNAME, BYSALARY}

    ;
    private SortMethod method;

    public EmployeeInfo(SortMethod method) {
        this.method = method;
    }

    //Comparators are unaware of the value in method
    public void sort(List<lesson8.lecture.comparator2.Employee> emps) {
        if (method == SortMethod.BYNAME) {
            Collections.sort(emps, new EmployeeNameComparator());
        } else if (method == SortMethod.BYSALARY) {
            Collections.sort(emps, new EmployeeSalaryComparator());
        }
    }
//}

    public static void main(String[] args) {
        List<lesson8.lecture.comparator2.Employee> emps = new ArrayList<>();
        emps.add(new lesson8.lecture.comparator2.Employee("Joe", 100000));
        emps.add(new Employee("Joe", 50000));
		Collections.sort(emps, new EmployeeNameComparator());
		System.out.println(emps);
    }
}


	
