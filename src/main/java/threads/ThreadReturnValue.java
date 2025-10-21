package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ThreadReturnValue {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		Future<Integer> returnValueOne = threadPool.submit(a);
		Future<String> returnValueTwo = threadPool.submit(b);
		
		System.out.println(returnValueOne );
		System.out.println(returnValueTwo);
	
		threadPool.shutdown();
		threadPool.awaitTermination(1, TimeUnit.MINUTES);
		
		System.out.println(returnValueOne.get() + " " + returnValueTwo.get());
	}
}

class ClassA implements Callable<Integer> {
	
	int number;
	
	public Integer call() {
		for (int i = 1; i < 100000; i++) {
			number++;
		}
		return number;
	}
	
}


class ClassB implements Callable<String> {
	String name;
	public String call() {
		for (int i = 0; i < 100000; i++) {
			name+= "a";
		}
		return name;
	}
}