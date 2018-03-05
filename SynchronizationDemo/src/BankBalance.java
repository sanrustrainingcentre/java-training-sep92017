
public class BankBalance 
{
	private double balance;
	
	public BankBalance(double balance) {
		this.balance = balance;
	}
	
	public synchronized void credit(double amount) {
		balance = balance + amount;
		System.out.println(Thread.currentThread().getName() + " => Current Balance = " + balance);
	}
	
	public synchronized void debit(double amount) {
		balance = balance - amount;
		System.out.println(Thread.currentThread().getName() + " => Current Balance = " + balance);
	}
}
