 package stack;

public class StackArray {

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
		
		while(top>-1) {
			System.out.println("Peeked " + stack[top]); //peek operation
			top--; //pop operation
		}
		System.out.println("Stack is empty");
	}
}
