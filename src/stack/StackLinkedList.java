package stack;

import java.util.LinkedList;

public class StackLinkedList {
	public static LinkedList<Integer> stack;
	
	public StackLinkedList() {
		stack = new LinkedList<>();
	}
	
	public int push(int value) {
		stack.addLast(value);
		return stack.getLast();
	}
	
	public int pop() {
		while(stack.isEmpty()) {
			System.out.println("Stack is already empty");
			return -1;
		}
		return stack.removeLast();
	}
	
	public int peek() {
		while(stack.isEmpty()) {
			System.out.println("Stack is already empty");
			return -1;
		}
		return stack.getLast();
	}
	
	public static void main(String[] args) {
		StackLinkedList s = new StackLinkedList();
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
