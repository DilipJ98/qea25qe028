package cognizant.qea25qe028;

public class Basic {
	
	int number;
	
	public Basic(int number) {
		this.number = number;
		System.out.println(number);
	}
	
	public Basic() {
		System.out.println("con with no prams");
	}
	
	public Basic(int a, int b, int c) {
		this();
		System.out.println("con with 3 prams");
	}
	
	
	 int add(int a, int b) {
		 System.out.println("parent add");
		return a + b;
	}
	
	int sub(int a, int b) {
		System.out.println(number);
		return a - b;
	}
	
	public static void main(String[] args) {
		Basic base = new Basic(800);

	}
	
}
