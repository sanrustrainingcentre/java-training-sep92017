package synchronizeddemo;

public class SynchronizedDemo {
	
	public static void main(String[] args) {
		
		TestMath testMath = new TestMath();
		
		MathThread t1 = new MathThread(testMath, "T1");
		MathThread t2 = new MathThread(testMath, "T2");
		MathThread t3 = new MathThread(testMath, "T3");
		MathThread t4 = new MathThread(testMath, "T4");
		MathThread t5 = new MathThread(testMath, "T5");
		MathThread t6 = new MathThread(testMath, "T6");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main method completed");
		
	}

}
