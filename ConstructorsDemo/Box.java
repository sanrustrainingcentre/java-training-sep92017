
/**
 * This class represents a typical Box object
 * 
 * @author Sanrus Training Centre
 *
 */
public class Box {
	
	double width;
	double height;
	double thickness;
	
	/**
	 * 
	 */
	Box() {
		
		//local variables inside Constructor
		int abc = 10;
		
		if(abc > 0) {
			int x = 25;
		}
		
	}

	/**
	 * 
	 * @param w
	 * @param h
	 * @param t
	 */
	Box(double width, double height, double thickness) {
		this.width = width;
		this.height = height;
		this.thickness = thickness;
		
		int x = 10;
		x = x;
	}
	
	/**
	 * 
	 * @param w
	 * @param h
	 * @param t
	 */
	Box(byte w, byte h, double t) {
		width = w;
		height = h;
		thickness = t;
	}
	
	/**
	 * 
	 * @param w
	 * @param h
	 * @param t
	 */
	Box(int w, int h, int t) {
		width = w;
		height = h;
		thickness = t;
	}
	
	/**
	 * 
	 * @param w
	 * @param h
	 * @param t
	 */
	Box(int w, double h, int t) {
		width = w;
		height = h;
		thickness = t;
	}
	
	/**
	 * 
	 * @return area of Box
	 */
	double area() {
		return width * height * thickness;
	}

}
