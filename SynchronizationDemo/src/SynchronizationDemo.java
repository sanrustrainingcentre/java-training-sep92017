
public class SynchronizationDemo {

	public static void main(String[] args) {
		
		//creating a bank balance object with initial amount of 100 CAD
		BankBalance bankBalance = new BankBalance(100);
		
		//create a debit thread
		DebitThread debitThread = new DebitThread(bankBalance);
		
		//create a credit thread
		CreditThread creditThread = new CreditThread(bankBalance);
		
		//debit thread will run after start() method is called on it
		debitThread.start();
		
		//credit thread will run after start() method is called on it
		creditThread.start();
		
		
		try {
			debitThread.join();
			creditThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread ended");

	}

}
