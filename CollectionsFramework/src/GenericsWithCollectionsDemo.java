import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class GenericsWithCollectionsDemo {

	public static void main(String[] args) {
		
		ArrayList<Person> listOfPersons = new ArrayList<Person>();
		
		Person p1 = new Person("A", "B", 20);
		Customer c1 = new Customer("C1", "D1", 25, "CUST001");
		Employee e1 = new Employee("C2", "D2", 30, "EMP001");
		
		listOfPersons.add(p1);
		listOfPersons.add(c1);
		listOfPersons.add(e1);
		
		Collections.sort(listOfPersons, new ComparatorUsingGenerics());
		
		System.out.println(listOfPersons);
		
		HashMap<String, Person> map = new HashMap<String, Person>();
		map.put("P1", p1);
		map.put("C1", c1);
		map.put("E1", e1);

	}

}
