package statickeyworddemo;

public class Circle {
	
	final double PI = (22.0/7);
	
	private double radius;
	protected static int count;
	
	public Circle(double radius) {
		this.radius = radius;
		count++;
	}
	
	public double area()
	{
		radius = 20;
		return (PI * radius * radius);
	}
	
	public static int getCount() {
		return count;
	}
	
	public static double getRadius(Circle circle) {
		return circle.radius;
	}

}
