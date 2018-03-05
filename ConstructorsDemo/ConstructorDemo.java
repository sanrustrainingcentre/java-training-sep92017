
public class ConstructorDemo {

	public static void main(String[] args) {
//		Box box1 = new Box(10, 20, 30);
//		Box box2 = new Box(1, 1, 1);
//		
//		System.out.println(box1.area());
//		System.out.println(box2.area());
//		
		byte val1 = 10;
		byte val2 = 20;
		byte val3 = 30;
		
		Box box3 = new Box();
		
		box3.area();
		
		BoxItem myBoxItem = new BoxItem(10, 20, 30);
		
	}

}
