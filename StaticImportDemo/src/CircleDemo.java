import folder1.Circle;
import static folder1.Circle.PI;

public class CircleDemo {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		
		//accessing the static member through an object
		System.out.println(circle1.PI);
		
		
		//accessing static member directly with Circle class name
		System.out.println(PI);

	}

}
