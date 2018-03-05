
public class ThreadDemo {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();
		MyThread t5 = new MyThread();
		MyThread t6 = new MyThread();
		MyThread t7 = new MyThread();
		MyThread t8 = new MyThread();
		MyThread t9 = new MyThread();
		MyThread t10 = new MyThread();
		MyThread t11 = new MyThread();
		
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		t4.setName("T4");
		t5.setName("T5");
		t6.setName("T6");
		t7.setName("T7");
		t8.setName("T8");
		t9.setName("T9");
		t10.setName("T10");
		t11.setName("T11");
		
		t1.start();//executes run() method in new context of execution
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		
		
		
		
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.isAlive();
		
		for (int index = 0; index < 100; index++) {
			System.out.println("j = " + index);
		}
		
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
			t7.join();
			t8.join();
			t9.join();
			t10.join();
			t11.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Main Thread execution completed");
		
	}

}
