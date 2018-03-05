
public class ContinueStatementDemo 
{

	public static void main(String[] args) 
	{
		//break in while loop
				int i = 0;
				
				while(i < 10)
				{
					if(i == 5)
					{
						continue;
					}
					
					System.out.println("i = " + i);
					i++;
				}
				
				System.out.println("After while loop");
				
				i = 0;
				
				while(i < 10)
				{
					
					int j = 0;
					while(j < 5)
					{
						j++;
						if(i == 3 && j == 2)
						{
							continue;
						}
						
						System.out.println("i = " + i + ", j = " + j);
						
					}
					
					i++;
				}
				
				System.out.println("After nested while loop");
				
				for(int a = 0; a < 10; a++)
				{
					for(int b = 0; b < 5; b++)
					{
						if(a == 3 && b == 2) 
						{
							continue;
						}
						
						System.out.println("a = " + a + ", b = " + b);
					}
				}
	}

}
