package polymorphismwithinterfaces;

public class InstanceOfDemo {

	public static void main(String[] args) {

		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		
		System.out.println("a1 instanceof Object => " + (a1 instanceof Object));
		System.out.println("a1 instanceof A => " + (a1 instanceof A));
		System.out.println("a1 instanceof B => " + (a1 instanceof B));
		System.out.println("a1 instanceof C => " + (a1 instanceof C));
		
		System.out.println("=============================================");
		
		System.out.println("b1 instanceof Object => " + (b1 instanceof Object));
		System.out.println("b1 instanceof A => " + (b1 instanceof A));
		System.out.println("b1 instanceof B => " + (b1 instanceof B));
		System.out.println("b1 instanceof C => " + (b1 instanceof C));
		
		System.out.println("=============================================");
		
		System.out.println("c1 instanceof Object => " + (c1 instanceof Object));
		System.out.println("c1 instanceof A => " + (c1 instanceof A));
		System.out.println("c1 instanceof B => " + (c1 instanceof B));
		System.out.println("c1 instanceof C => " + (c1 instanceof C));

	}

}
