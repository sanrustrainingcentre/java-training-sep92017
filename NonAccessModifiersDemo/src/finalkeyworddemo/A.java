package finalkeyworddemo;


//marking 'final' to the class declaration will prevent inheritance by any class
public class A {
	
	//default value for x set by JVM is 0
	int x;
	
	//final variables must be initialized before the object is created
	final int y = 10;
	
	final int z;
	
	A(int z)
	{
		this.z = z;//dynamic constant
	}
	
	A() 
	{
		super();
		this.z = 5;//static constant
	}
	
	A(final int x, final int y) {
		super();
		//x = 20; => compile error
		//y = 30; => compile error, as we cannot reassign the final value
		z = (x + y);
	}
	
	void setZ(final int z1) {
		//z1 = 10;
		//z = z1; => cannot reassign instance variable 'z'
	}
	
	final void method1() {
		System.out.println("A's method1()");
		final int result;
		
		result = 10;
		
		//result = 11; => compile error as the local constant is already assigned once
		
		System.out.println(result);
	}
	
	

}
