
public class BankAccount {
	
	//'private' members are visible/accessed only from within its class
	private double bankBalance;
	private double limitPerDay = 1000;
	private String pin = "1234";
	
	public BankAccount(double bankBalance) {
		this.bankBalance = bankBalance;
	}
	
	public void debit(String pin, double amount) {
		
		if(this.pin.equals(pin)) {
			if(amount <= limitPerDay) {
				if(amount > 0) {
					if(bankBalance >= amount) {
						bankBalance = bankBalance - amount;
					} else {
						System.out.println("Insufficient funds.");
					}					
				} else {
					System.out.println("Withdrawl amount cannot be negative or zero value.");
				}
			} else {
				System.out.println("Reached limit per day.");
			}
		} else {
			System.out.println("Wrong pin!. Try again.");
		}
		
	}
	
	double getBankBalance() {
		return bankBalance; 
	}
}
