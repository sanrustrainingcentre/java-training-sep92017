import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List list = new LinkedList();
		
		Person p1 = new Person("A", "B", 30);
		
		list.add(1);
		list.add("Hello");
		list.add(1, p1);
		
		Object obj = list.get(2);
		
		if (obj instanceof Person) {
			Person p = (Person) obj;
		}
		
		System.out.println("Size of an element => " + list.size());
		
		//accessing elements of a list
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		
		//for each loop
		for (Object element : list) {
			
		}
		
		

	}

}
