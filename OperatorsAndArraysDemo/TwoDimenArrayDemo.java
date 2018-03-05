
public class TwoDimenArrayDemo {

	public static void main(String[] args) {
		
		int[][] studentMarks = new int[10][5];
		
		System.out.println("Number of rows in studentMars[][] array = " + studentMarks.length);
		
		studentMarks[0][0] = 90;
		studentMarks[9][4] = 100;
		
		
		//Jagged Arrays
		int[][] studentMarks1 = 
			{
					{10, 20, 30},
					{40, 50, 60, 100, 50},
					{70, 80, 90}
			};
		
		System.out.println(studentMarks1[1].length);
		System.out.println(studentMarks1[1][0]);
		
		int[][] studentMarks2 = new int[][]
								{
									{1, 2, 3},
									{4, 5},
								};
								
		int[] temp = {1, 2, 3, 4};
		studentMarks1[1] = temp;
		System.out.println(studentMarks1[1].length);
		System.out.println(studentMarks1[1][0]);
		
		System.out.println(studentMarks);
		
		char ch = 'A';
		System.out.println((char) (ch + 1));
		
		System.out.println(~10);

	}

}
