
public abstract class Animal extends Object {
	
	//private methods cannot be overridden, because they are visible to the same class
	public abstract void eat();
	
	public void sleep()
	{
		System.out.println("Every animal sleeps");
	}

}
