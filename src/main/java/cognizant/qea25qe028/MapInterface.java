package cognizant.qea25qe028;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String[] args) {
		Map<String, Integer> fruits = new TreeMap<>();
		
		fruits.put("kiwi", 2000);
		fruits.put("apples", 100);
		
		Iterator<Map.Entry<String, Integer>> it = fruits.entrySet().iterator();
		
		
		
		System.out.println(it.next());
		
//		System.out.println(fruits.entrySet());
	}
}
