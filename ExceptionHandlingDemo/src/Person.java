
public class Person {

	private String firstName;
	private String lastName;
	
	//Person(String, String) constructor
	public Person(String firstName, String lastName) throws FirstNameRequiredException, LastNameRequiredException
	{
		//validating the first name 
		if (firstName == null || firstName.isEmpty()) {
			FirstNameRequiredException firstNameRequiredException = new FirstNameRequiredException("First name is required.");
			throw firstNameRequiredException;//developer is throwing custom exception
		}
		
		if (lastName == null || lastName.isEmpty())
		{
			LastNameRequiredException lastNameRequiredException = new LastNameRequiredException("Last name is required.");
			throw lastNameRequiredException;
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		
	}
	
}
