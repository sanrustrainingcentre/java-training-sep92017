/**
 * Java Documentation
 * 
 * This class prints only the even numbers.
 * 
 * @author Sanrus Training Center
 *
 */
public class ContinueStatementDemo {

	//single line code commenting
	/*
	 * Multi line code commenting
	 */
	public static void main(String[] args) 
	{
		if(args.length == 0 
				|| args[0] == null) {
			System.out.println("example usage: java ContinueStatementDemo <number>");
			return;
		}
		int n = Integer.parseInt(args[0]);
		
		for(int i = 0; i < n; i++) {
			if(i % 3 != 0) {
				continue;				
			}
			
			System.out.print(i + "\t");
			
		}

	}

}
