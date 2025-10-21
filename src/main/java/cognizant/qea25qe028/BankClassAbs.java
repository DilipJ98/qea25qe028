package cognizant.qea25qe028;

public abstract class BankClassAbs {
	 
	int value;
	public BankClassAbs(int value) {
		this.value = value;
		System.out.println(value);
	}
	
	abstract void withDrawl();
	
	public void coupon() {
		System.out.println("this is coupon applied");
	}
}
