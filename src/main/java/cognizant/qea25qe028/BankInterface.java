package cognizant.qea25qe028;

public interface BankInterface {
	int number = 100;
	void withDrawl();
//	void deposit();
	
	default void defaultMethod() {
		System.out.println("default method");
	}
}

//run time and compile time