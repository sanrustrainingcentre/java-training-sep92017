
public class ForEachDemo 
{

	public static void main(String[] args) 
	{
		int values[] = {20, 40, 60, 80, 100};
		
		int index = 0;
		for(int value : values)
		{
			System.out.println("Value at index = "+ index + " is: " + value);
			index++;
		}
	}

}
