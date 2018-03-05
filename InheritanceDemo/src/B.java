
public class B extends A {
	int y = 5;
	int z = 25;
	
	B() {}
	
	
	int getZFromB() {
		return z;
	}
	
	int getZFromA() {
		return super.z;
	}
}
