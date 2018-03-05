
public class SingleDimenArrayDemo {

	public static void main(String[] args) {
		
		//1st Approach to declare and create an array
		//single dimension array declaration
		int[] marks;
		
		//creating an array and assigning to marks array variable
		marks = new int[5];
		
		System.out.println(marks[0]);
		
		marks[0] = 10;
		marks[1] = 20;
		marks[2] = 30;
		marks[3] = 40;
		marks[4] = 50;
		
		System.out.println(marks[2]);
		
		int x = marks[1];
		
		int a = 10;
		int b = a;
		b = b + 2;
		
		
		//2nd approach
		int[] marks1 = {10, 20, 30 ,40, 50};
		marks1[4] = 100;
		
		
		//3rd approach
		int[] marks2 = new int[] {10, 20, 30, 40, 50};
		
		int a1 = 1;
		int b1 = 2;
		
		int c = a1;
		
		int[] values = new int[]{a1, b1};
		
		int result = a1 + b1;
		
		int[] array = new int[result];
		System.out.println("Length of array = " + array.length);
		

	}

}












