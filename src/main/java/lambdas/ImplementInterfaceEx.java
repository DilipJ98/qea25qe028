package lambdas;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ImplementInterfaceEx  {
	public static void main(String[] args) {
		Function<String, Integer> fun = (String str) -> str.length();
		System.out.println(fun.apply("Dileep"));
	}
}


// () -> {};

//Prediacate -> test()
//Consumer -> accept();
//Funtion -> apply()
//Supplier -> get()