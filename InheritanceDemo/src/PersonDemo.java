
public class PersonDemo {

	public static void main(String[] args) {
//		Customer customer = new Customer("First", "Last");
//		
//		System.out.println(customer.firstName);
//		System.out.println(customer.lastName);
		
		Person person;
		person = new Person("First", "Last");
		
		person = null;
		
		method1(person);
		
		
		System.out.println("End of main method");
	}
	
	static void method1(Person person) {
		person.firstName = "ABC";

	}

}
