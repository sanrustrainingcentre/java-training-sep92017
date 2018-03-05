
public class Box 
{
	
	double height;
	double width;
	double thickness;
	
	
	double getWidth() {
		return width;
	}
	
	double getHeight() {
		return height;
	}
	
	double getThickness() {
		return thickness;
	}
	
	double area() {
		return (width * height * thickness);
	}
	
	int display() {
		int errorCode = 20;
		if(width <= 0 || height <= 0 || thickness <= 0) {
			System.out.println("Box is not well formed to print its information.");
			return errorCode;
		} 
		
		System.out.println("Box info:-");
		System.out.println("Width = " + width);
		System.out.println("Height = " + height);
		System.out.println("Thickness = " + thickness);
		
		
		return 0;
	}
	
	
}
