import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
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
