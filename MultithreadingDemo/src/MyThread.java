
public class MyThread extends Thread {
	
	public void run()
	{
		System.out.println(isAlive());
		
		for (int index = 0; index < 100000; index++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + " => " + index);
		}
	}
}
