
public class Dog extends Animal {
	
	//overridden methods must have same or broader access level
	public void eat()
	{
		System.out.println("Dog way of eating the food");
	}
	
	public void sleep()
	{
		System.out.println("Dog way of sleeping");
	}

	void dogSpecificBehavior()
	{
		System.out.println("Dog's specific behavior goes in here");
	}
}
