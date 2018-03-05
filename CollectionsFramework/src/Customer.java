
public class Customer extends Person {
	
	Customer(String firstName, String lastName, int age, String customerId) {
		super(firstName, lastName, age);
		this.customerId = customerId;
	}
	
	String customerId;
	
	public String toString() {
		return "Customer with "+ customerId + " => " + super.toString();
	}

}
