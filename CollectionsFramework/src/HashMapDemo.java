import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map hashMap = new HashMap();
		
		hashMap.put(1, 20);
		hashMap.put(1, 30);
		
		hashMap.put(5,  28);
		hashMap.put(6,  29);
		hashMap.put(7,  30);
		
		hashMap.put(2,  25);
		hashMap.put(3,  26);
		hashMap.put(4,  27);
		
		hashMap.remove(1);
		
		System.out.println(hashMap);
		hashMap.size();
	
	}

}
