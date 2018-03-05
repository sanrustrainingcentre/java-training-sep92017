
public class DebitThread extends Thread {
	
	private BankBalance bankBalance;
	
	public DebitThread(BankBalance bankBalance) {
		super("DebitThread");
		this.bankBalance = bankBalance;
	}
	
	public void run() {
		if(bankBalance != null) {
			for(int i = 0; i < 100; i++) {
				bankBalance.debit(5);
			}
		}
	}

}
