/**
 * 
 * @author Sanrus Training Centre
 *
 */
public class ForStatementDemo 
{

	public static void main(String[] args) 
	{
		
		int[] array = {100, 200, 300, 400, 500, 600};
		
//		int total = array[0] + array[1] + array[2] + array[3] + array[4];
//		double average = ((double) total / array.length);
//		
//		System.out.println("Total = " + total);
//		System.out.println("Average = " + average);
		
		int total = 0;
		double average = 0;
		
		for(int index = 0, i = 0;index < array.length && i< 10; index++, i--)
		{	
			total += array[index];
		}
		
		average = ((double) total) / array.length;
		
		System.out.println("Total = " + total);
		System.out.println("Average = " + average);

	}

}
