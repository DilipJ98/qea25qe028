package cognizant.qea25qe028;

public class Employee  {
	int id;
	String name;
	String role;
	float salary;
	
	public Employee(int id, String name, String role, float salary) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
	
}
