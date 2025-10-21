package cognizant.qea25qe028;

import java.util.Scanner;

public class ConditionalEx {
	public static void main(String[] args) {
//		ifElseMethod();
		switchCaseMethod();
	}
	
	static void ifElseMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = sc.nextInt();
		
		if (age > 18 ) {
			System.out.println("The person is eligible to vote");
		} else if (age == 18) {
			System.out.println("the person is eligible to vote");
		}
		else {
			System.out.println("The person is not eligible to vote");
		}
	}
	
	
	static void switchCaseMethod() {
		int age = 18;
		float floatValue = 10.01f;
		String name = "Dileep";
		char ch = 'D';
		
		switch(name) {
			case "nsbda":
				System.out.println("This is case 1");
				break;
			case "sbvdfhj":
				System.out.println("This is case 2");
				break;
			case "sabndvgsha":
				System.out.println("This is case 3");
				break;
			case "Dileep":
				System.out.println("This is case 18");
				break;
				
			default:
				System.out.println("this is default case");
		}
	}
	
}
