package cognizant.qea25qe028;

public class UseBank {
	public static void main(String[] args) {
		BankInterface bank = new SbiCreditCard();
		bank.withDrawl();
		System.out.println("main");
	}
	
	public static void main(String args) {
		System.out.println("main string args");
		
	}
	public static void main(int[] args) {
		System.out.println("main int args");
	}
}
