
public class Customer extends Person {
	String customerId;
	

	Customer(String firstName, String lastName) {
		super(firstName, lastName);
		System.out.println("Customer class default constructor");
	}
}
