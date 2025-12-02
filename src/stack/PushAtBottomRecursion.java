package stack;

import java.util.Stack;

public class PushAtBottomRecursion {

	public static void pushAtBottom(int value, Stack<Integer> s){
		if(s.isEmpty()) {
			s.push(value);
			return;
		}
		
		int top = s.pop();
		pushAtBottom(value,s);
		s.push(top);
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Original Stack sequence: " + stack);
		pushAtBottom(40,stack);
		System.out.println("New Stack sequence: " + stack);
		
	}

}
