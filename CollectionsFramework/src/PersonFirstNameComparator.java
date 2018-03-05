import java.util.Comparator;

public class PersonFirstNameComparator implements Comparator {
	
	private boolean isAscendingOrder;
	
	public PersonFirstNameComparator() {
		isAscendingOrder = false;
	}
	
	public PersonFirstNameComparator(boolean isAscendingOrder) {
		this.isAscendingOrder = isAscendingOrder;
	}

	@Override
	public int compare(Object o1, Object o2) {
		
		if ((o1 instanceof Person) && (o2 instanceof Person)) {
			Person p1 = (Person) o1;
			Person p2 = (Person) o2;
			
			if (isAscendingOrder) {
				return p2.firstName.compareTo(p1.firstName);				
			} else {
				return p1.firstName.compareTo(p2.firstName);
			}
			
			
		} else {
			throw new RuntimeException("o1 and o2 must be an instanceof Person");
		}
		
	}
	
}
