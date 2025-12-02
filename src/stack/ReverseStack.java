package stack;

import java.util.Stack;

public class ReverseStack {

	public static Stack<Integer> reverseStack(Stack<Integer> original){
		Stack<Integer> temp = new Stack<Integer>();
		
		while(!original.isEmpty()) {
			temp.push(original.pop());
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("Original stack: " + stack);
		
		System.out.println("Reverse Stack: " + reverseStack(stack));
		
	}

}
