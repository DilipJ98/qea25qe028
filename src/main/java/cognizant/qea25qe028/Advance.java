package cognizant.qea25qe028;

public class Advance extends Basic {
	
	public Advance() {
		super(100);
		System.out.println("this is child cons with no param");
	}
	
	int mutli(int a, int b) {
		return a* b;
	}
	
	int division(int a, int b) {
		return a /b;
	}
	
	int add(int a, int b) {
		super.add(100, 200);
		System.out.println("child add");
		return a + b;
	}
	
	public static void main(String[] args) {
		Advance ad = new Advance();
		ad.add(20, 30);
	
	}
}


//this and this()

//super  and super()