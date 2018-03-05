
public class BoxItem {
	
	double width;
	double height;
	double thickness;
	
	BoxItem(double h, double w, double t) {
		width = w;
		height = h;
		thickness = t;
	}
	
	BoxItem(int h, int w, int t) {
		this((double) h, (double) w, (double) t);
	}
	
	BoxItem(int h, int w, double t) {
		this((double) h, (double) w, t);
	}
	
	void display() {
		this.width = 10;
		System.out.println("Width = " + this.width);
		System.out.println("Height = " + height);
		System.out.println("Width = " + width);
	}
	
}
