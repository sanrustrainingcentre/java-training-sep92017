package finalkeyworddemo;

import statickeyworddemo.Circle;

public class FinalKeywordDemo {

	//public => visible to all the classes even outside the project and JVM/JRE
	//static => main() method belongs to static/class scope, so that JVM can execute this method without creating any object
	//void => no return value to JVM
	//args => program initial arguments that can be passed during class execution. 
	//e.g: java FinalKeywordDemo 10 20 30 is the class execution, and args = ["10", "20", "30"] are program initial arguments
	public static void main(String[] args) {
		
		A a1 = new A(20);
		a1.method1();
		System.out.println(a1.z);
		
		B b1 = new B();
		b1.method1();
		
		//protected = default access + subclasses in any package
		System.out.println(Circle.count);//compile error as the count is having protected access
		
		//a1.z = 20;//compile error as we cannot set value to 'z' constant

	}

}
