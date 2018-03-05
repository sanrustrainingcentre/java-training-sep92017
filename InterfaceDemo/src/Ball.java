
public abstract class Ball {
	
	public static final double PI = (22.0/7);
	
	double radius;
	
	double volume() {
		return (4.0/3) * PI * Math.pow(radius, 3);
	}

}
