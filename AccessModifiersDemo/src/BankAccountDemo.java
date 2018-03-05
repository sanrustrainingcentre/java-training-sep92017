
public class BankAccountDemo {

	public static void main(String[] args) {
		
		BankAccount chequingAccount = new BankAccount(50);
		chequingAccount.debit("1234", -1000);
		
		System.out.println(chequingAccount.getBankBalance());
	}

}
