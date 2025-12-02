package stack;

import java.util.Stack;

public class StackCF {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		while(!s.empty()) {
			System.out.println("Peeked: " + s.peek());
			System.out.println("Popped out: " + s.pop());
		}
		if(s.empty()) {
			System.out.println("Stack is already empty");
		}
	}

}
