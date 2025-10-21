package cognizant.qea25qe028;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterfaceEx {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(200);
		list.add(500);
		list.set(1, 2000);

		Collections.sort(list);
		
//		Iterator<Integer> it = list.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		System.out.println(list);
		
	}
}


//int -> Integer
//float -> Float
//char -> Character
//boolean -> Boolean