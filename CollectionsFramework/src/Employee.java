
public class Employee extends Person {

	String employeeId;
	
	public Employee(String firstName, String lastName, int age, String employeeId) {
		super(firstName, lastName, age);
		this.employeeId = employeeId;
	}
	

}
