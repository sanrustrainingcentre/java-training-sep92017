
public class TryCatchDemo {

	public static void main(String[] args) {
		
		try 
		{
			try {
				int divResult = (1/0);//division by zero, and hence ArithmeticException
			}
			finally
			{
				System.out.println("Finally block for inner try");
			}
			
			int[] marks = new int[4];//this statement is fine, because we are only creating an array of 4 cells
			
			marks[4] = 90;//array index = 0 to 3, but using index=4 will result into an exception
			
			
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			
		}
		catch (IndexOutOfBoundsException e)
		{
			
		}
		catch (ArithmeticException e)
		{
			System.out.println("ArithmeticException catch block for outer try");
		}
		catch (RuntimeException e)
		{
			
		}
		catch (Exception e)
		{
			
		}
		finally
		{
			System.out.println("Finally block for outer try");
		}
		
		System.out.println("After try-catch-finally blocks");
		
		
		
		
		try 
		{
			int divResult = (1/0);//division by zero, and hence ArithmeticException
			
			int[] marks = new int[4];//this statement is fine, because we are only creating an array of 4 cells
			
			marks[4] = 90;//array index = 0 to 3, but using index=4 will result into an exception
		}
		catch (Exception e)
		{
			
		}
		
		
		try 
		{
			int divResult = (1 / 0);
		}
		catch (ArithmeticException e)
		{
			
		}
		catch (Exception e)
		{
			
		}
		
		

	}

}







