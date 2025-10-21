package cognizant.qea25qe028;

public class StringExamples {
	public static void main(String[] args) {
		String str = "BMW";
		String strTwo = "benz";
		String strThree = "benz";
		
		StringBuilder buffer = new StringBuilder("Hello");
		buffer.append("World");
		buffer.delete(0, 5);
		System.out.println(buffer);
		
	}
}
