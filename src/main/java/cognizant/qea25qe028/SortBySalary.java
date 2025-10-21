package cognizant.qea25qe028;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {
	
	public int compare(Employee empOne, Employee empTwo) {
		return Float.compare(empOne.salary, empTwo.salary);
	}
}
