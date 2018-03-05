import java.util.Comparator;

public class ComparatorUsingGenerics implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return p2.firstName.compareTo(p1.firstName);
	}
	
	

}
