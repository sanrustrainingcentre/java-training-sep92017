
public class Person extends java.lang.Object {

	String firstName;
	String lastName;
	int age;
	char gender;//'M' or 'F' or 'm' or 'f'
	
	Person(String firstName, String lastName) {
		System.out.println("Person class default constructor");
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
