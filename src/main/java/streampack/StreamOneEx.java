package streampack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOneEx {
	public static void main(String[] args) {
		List<List<String>> names = Arrays.asList(Arrays.asList("Java", "Python", "Rust", "Ruby"), Arrays.asList("C", "C++"));
		
//		names.stream().flatMap(s -> s.stream()).forEach(s -> System.out.println(s));
		
		
//		names.stream().filter(name -> name.contains("R")).forEach(s -> System.out.println(s));
		
//		List<String> n = names.stream().map(s -> s.concat("Programming language")).collect(Collectors.toList());
//		System.out.println(n);
	}
}

// collection -> stream -> INtermediate and Terminal


// intermediate -> filter(), map(), flatmap(), sorted()
//Terminal op -> forEach(), count(), collect(), max(), min(), reduce()


