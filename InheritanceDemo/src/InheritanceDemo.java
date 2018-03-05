
public class InheritanceDemo extends Object {

	public static void main(String[] args) {
		
		A a1 = new A();
		a1.x = 20;
		
		B b1 = new B();
		b1.y = 50;
		b1.x = 100;
		
		System.out.println("a1.z =>" + a1.z);
		System.out.println("a1.getZ() =>" + a1.getZ());
		
		System.out.println("b1.z => " + b1.z);
		System.out.println("b1.getZFromB() => " + b1.getZFromB());
		System.out.println("b1.getZFromA() => " + b1.getZFromA());
		

	}

}
