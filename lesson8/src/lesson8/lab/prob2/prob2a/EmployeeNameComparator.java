package lesson8.lab.prob2.prob2a;


import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		int result =  e1.name.compareTo(e2.name);
		if(result == 0) {
			if(e1.salary > e2.salary) return 1;
			if(e1.salary <e2.salary) return -1;
			else return 0;
		}
		return result;
	}
}
