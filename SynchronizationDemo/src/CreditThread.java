
public class CreditThread extends Thread {
	
	private BankBalance bankBalance;
	private volatile int x;
	
	public CreditThread(BankBalance bankBalance) {
		super("CreditThread");
		this.bankBalance = bankBalance;
	}
	
	public void run() {
		x++;
		if(bankBalance != null) {
			for(int i = 0; i < 100; i++) {
				bankBalance.credit(5);
				//Thread.sleep(1000); sleep called outside the monitor object
			}
		}
	}

}
