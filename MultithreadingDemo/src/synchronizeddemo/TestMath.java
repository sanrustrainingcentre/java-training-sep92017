package synchronizeddemo;

public class TestMath {
	
	private int x;
	
	public synchronized int increment() {
		x++;
		return x;
	}
	
}
