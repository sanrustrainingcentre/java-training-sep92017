
public class StringDemo {

	public static void main(String[] args) {
		
		String str1 = "Hello World";
		String str2 = new String("Hello World");
		String str3 = new String(str2);
		
		byte[] stringBytes = new byte[1];
		stringBytes[0] = 72;
		String str4 = new String(stringBytes);

	}

}
