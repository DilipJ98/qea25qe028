package threads;

public class ThreadsEx {
	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		A aObj = new A();
		B bObj = new B();
		
		Thread t1 = new Thread(aObj);
		Thread t2 = new Thread(bObj);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
//		aObj.methodA();
//		bObj.methodB();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		System.out.println(Thread.currentThread().getName());
	}
}


class A implements Runnable{
	public void methodA() {
		try {
			Thread.sleep(5000);
			System.out.println("Method A: " + Thread.currentThread().getName());
		}catch (Exception e) {
			// TODO: handle exception
		}
		}
	
	public void run() {
		methodA();
	}
}

class B implements Runnable{
	public void methodB() {
		try {
			Thread.sleep(7000);
			System.out.println("Method B: " + Thread.currentThread().getName());
		}catch (Exception e) {
			// TODO: handle exception
		}
		}
	public void run() {
		methodB();
	}
}
