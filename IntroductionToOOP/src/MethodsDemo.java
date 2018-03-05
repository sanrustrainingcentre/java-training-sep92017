
public class MethodsDemo 
{

	//entry point of the java program
	public static void main(String[] args) 
	{
		//1. create circle object
		Circle circleObject = new Circle();
		
		circleObject.area();
		
		//2. assigning radius to the above circle object
		circleObject.radius = 9;
		
		//2. calculate the area of the circle
		double area = circleObject.area();
		
		System.out.println("main() method ==> " + area + " sq.cm");
		
		
		//Box object
		Box box = new Box();
		box.width = 10;
		box.height = 15;
		box.thickness = 20;
		
		int errorCode = box.display();
		System.out.println("main() method ==> Error Code = " + errorCode);
	}

}
