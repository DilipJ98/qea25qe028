package cognizant.qea25qe028;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeData {
	public static void main(String[] args) {
		Employee billings = new Employee(20, "Billings", "Dev", 200000.00f);
		Employee sam = new Employee(100, "Sam",	 "Devops", 100000.00f);
		Employee kane = new Employee(50, "Kane",	 "Sdet", 500000.00f);
		
		List<Employee> list = Arrays.asList(sam,  kane, billings);
	
		Collections.sort(list, new SortBySalary());
		System.out.println(list);
		
	}
}
