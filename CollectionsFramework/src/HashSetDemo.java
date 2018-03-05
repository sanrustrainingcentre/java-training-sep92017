import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet hashSet = new HashSet();
		
		hashSet.add(1);
		hashSet.add(10);
		hashSet.add(-1);
		hashSet.add(50);
		hashSet.add(150);
		hashSet.add(2);
		hashSet.add(100);
		hashSet.add(100);
		hashSet.add(100);
		hashSet.add(100);
		hashSet.add(100);
		hashSet.add(100);
		
		System.out.println(hashSet);
		
		
		Person p1 = new Person("A", "B", 20);
		Person p2 = new Person("A", "B", 20);
		Person p3 = new Person("A", "B", 20);
		Person p4 = new Person("A", "B", 20);
		
		HashSet setOfPersons = new HashSet();
		setOfPersons.add(p1);
		setOfPersons.add(p2);
		setOfPersons.add(p3);
		setOfPersons.add(p4);
		
		System.out.println(setOfPersons);
		

	}

}
