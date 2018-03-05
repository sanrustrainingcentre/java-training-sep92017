
public class PersonFormDemo {

	public static void main(String[] args) {
		
		try {
			Person p = new Person("", "");
			p.setFirstName("");
		}
		catch (FirstNameRequiredException e)
		{
			System.out.println(e.getMessage());
		}
		catch (LastNameRequiredException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
