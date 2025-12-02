package stack;

import java.util.ArrayList;

public class StackArrayList {
	ArrayList<Integer> stack;
	
	public StackArrayList() {
		stack = new ArrayList<>();
	}
	
	public int push(int value) {
		stack.add(value);
		return stack.get(stack.size()-1);
	}

	public int pop() {
		if(stack.isEmpty()) {
			System.out.println("Stack is already empty");
			return -1;
		}
		return stack.remove(stack.size()-1);
	}
	
	public int peek() {
		if(stack.isEmpty()) {
			System.out.println("Stack is already empty");
			return -1;
		}
		return stack.get(stack.size()-1);
	}
	
	public static void main(String[] args) {
		StackArrayList s = new StackArrayList();
		System.out.println("Pushed: " + s.push(10));
		System.out.println("Pushed: " + s.push(20));
		System.out.println("Pushed: " + s.push(30));

		System.out.println("Peeked: " + s.peek());
		System.out.println("Popped: " + s.pop());
		System.out.println("Popped: " + s.pop());
		System.out.println("Popped: " + s.pop());
		System.out.println("Popped: " + s.pop());
		
	}

}
