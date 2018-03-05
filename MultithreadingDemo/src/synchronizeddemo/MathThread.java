package synchronizeddemo;

public class MathThread extends Thread {
	
	private TestMath testMathObject;
	
	public MathThread(TestMath testMathObject, String threadName) {
		super(threadName);
		this.testMathObject = testMathObject; 
	}
	
	public void run() {
		System.out.println(getName() + " => " + testMathObject.increment());
	}

}
