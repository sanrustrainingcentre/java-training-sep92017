
//Polymorphism can be achieved only with the combination of Inheritance + Method Overridding
public class PolymorphismDemo {

	public static void main(String[] args) {
		
//		//creating animal object
//		Animal animal = new Animal();
//		
//		//toString() and hashCode() methods are inherited from java.lang.Object class
//		animal.toString();
//		animal.hashCode();
//		
//		animal.eat();
//		animal.sleep();
//		
//		//creating Dog() object
//		Dog dog = new Dog();
//		
//		dog.toString();
//		dog.hashCode();
//		
//		dog.eat();
//		dog.sleep();
//		
//		dog.dogSpecificBehavior();
//		
//		//super class reference can point to sub class object,
//		//because sub class can do anything that the super class does
//		Animal dog1 = new Dog();
//		
//		dog1.toString();
//		dog1.hashCode();
//		
//		dog1.eat();
//		dog1.sleep();
//		
//		//compile error because dog1 is of type Animal
//		//compiler looks for the type of the class and not the target object 
////		dog1.dogSpecificBehavior();
//		
//		//compile error
//		//sub class reference cannot point to super class Object
////		Animal dog2 = new Object();
//		
//		//super class reference can point to its own object + any sub class objects
//		Object obj = new Animal();//this works
		
		
		//Polymorphism Example
		
//		Animal a = new Animal();
//		Animal d = new Dog();
//		Animal c = new Cat();
//		
//		a.eat();
//		d.eat();
////		d.dogSpecificBehavior();//compile error because Animal class does not have dogSpecificBehavior() method
//		c.eat();
		
		//Example 2
		Animal[] animals = new Animal[3];
//		animals[0] = new Animal(); // compile error as Animal is defined as abstract class
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Bird();
		
		for(int i = 0; i < animals.length; i++) {
//			executeEatBehavior(animals[i]);
			Animal animal = animals[i];
			animal.eat();
		}
		
		
//		Animal bird = new Bird();
//		bird.eat();

	}
	
	public static void executeEatBehavior(Animal animal) {
		animal.eat();
	}
	
}








