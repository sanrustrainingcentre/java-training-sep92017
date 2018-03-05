import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.add(10);
		stack.add(1);
		stack.add(-10);
		stack.add(5);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.size());

	}

}
