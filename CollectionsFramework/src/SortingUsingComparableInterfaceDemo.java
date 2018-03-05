import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingComparableInterfaceDemo {

	public static void main(String[] args) {
		
		List listOfPersons = new ArrayList();
		
		listOfPersons.add(new Person("A1", "B1", 24));
		listOfPersons.add(new Person("A2", "B2", 22));
		listOfPersons.add(new Person("A3", "B3", 30));
		listOfPersons.add(new Person("A4", "B4", 25));
		listOfPersons.add(new Person("A5", "B5", 19));
		
		Collections.sort(listOfPersons);
		
		System.out.println(listOfPersons);
		
		
		PersonFirstNameComparator sortByFirstNameAsc = new PersonFirstNameComparator();
		PersonFirstNameComparator sortByFirstNameDesc = new PersonFirstNameComparator(true);
		
		Collections.sort(listOfPersons, sortByFirstNameAsc);
		System.out.println(listOfPersons);
		
		Collections.sort(listOfPersons, sortByFirstNameDesc);
		System.out.println(listOfPersons);
		
		

	}

}
