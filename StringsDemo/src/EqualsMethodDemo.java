import java.awt.List;
import java.util.ArrayList;
import java.util.Locale;

public class EqualsMethodDemo {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";//str2 = str1
		
		String str3 = new String("Hello");//creates a new string of "Hello" word
		
		System.out.println("(str1 == str2) => " + (str1 == str2));
		System.out.println("(str1 == str3) => " + (str1 == str3));
		System.out.println("(str2 == str3) => " + (str2 == str3));
		
		
		System.out.println("(str2.equals(str2)) => " + (str1.equals(str2)));
		System.out.println("(str1.equals(str2)) => " + (str2.equals(str2)));
		System.out.println("(str1.equals(str3)) => " + (str1.equals(str3)));
		System.out.println("(str2.equals(str3)) => " + (str2.equals(str3)));
		
		str1.toUpperCase(Locale.CANADA_FRENCH);
		str1.toUpperCase(Locale.FRANCE);
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("H");
		stringBuffer.append("e");
		stringBuffer.toString();
		
		String str5 = "H";
		str5 = str5 + "e";
		

	}

}
