package threads;

public class ExampleOfObjs {
	
	StringBuffer builder = new StringBuffer();
	
	public int changeStringBuilderObj() {
		 
		return builder.length();
	}
	
	
	public static void main(String[] args) throws InterruptedException {	
			
		ExampleOfObjs ex = new ExampleOfObjs();
		Thread t1 = new Thread() {
			@Override
			public void run() {
//				System.out.println(Thread.currentThread().getName());
				for (int i = 1; i <= 100000; i++) {
					ex.builder.append("h");
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 100000; i++) {
					ex.builder.append("h");
				}
//				System.out.println(Thread.currentThread().getName());
			}
		};
		
		t1.start();
		t2.start();
		t2.join();
		t1.join();
		System.out.println(ex.changeStringBuilderObj() + " this is length of string builder");
	}
}
