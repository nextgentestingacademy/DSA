package stack;

public class StackRecursion {

	public static void main(String[] args) {
		
		int[] stack = new int[5];
		int top = -1;
		
		//push operations
		top++;
		stack[top] = 10;

		top++;
		stack[top] = 20;

		top++;
		stack[top] = 30;
		
		printAndPopRecursively(stack,top);
	}

	private static void printAndPopRecursively(int[] stack, int top) {

		if(top<0) {
			System.out.println("Stack is already empty");
			return;
		}
		
		System.out.println("Peeked: " + stack[top]);
		printAndPopRecursively(stack, --top);
		
	}

}
