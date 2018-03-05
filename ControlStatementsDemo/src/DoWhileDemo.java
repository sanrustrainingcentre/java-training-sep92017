import java.util.Scanner;

/**
 * 
 * @author Sanrus Training Centre
 *
 */
public class DoWhileDemo 
{

	public static void main(String[] args) 
	{
		//initializing the character to null character.
		char ch = '\0';
		double prices[] = {10.5, 5.5, 9};
		double total = 0;
		
		do
		{
			System.out.println("Choose a dish for checkout.");
			System.out.println("1. Dish 1");
			System.out.println("2. Dish 2");
			System.out.println("3. Dish 3");
			System.out.println("Press 'x' to quit the menu");
			System.out.println("Press 'h' for help");
			System.out.print(">>>");
			
			Scanner scanner = new Scanner(System.in);
			ch = (char) scanner.nextLine().charAt(0);
			
			switch (ch) {
				case '1':
					total += prices[0];				
					break;
				case '2':
					total += prices[1];
					break;
				case '3':
					total += prices[2];
					break;
				case 'h':
					System.out.println("Help requested. Please wait for any attendant.");
					break;
				default:
					if(ch != 'x') 
					{
						System.out.println("Unknown selection. Please try again.");
					}
					break;
			}
			
		}
		while(ch != 'x');
		
		System.out.println("Total price = " + total);
		

	}

}
