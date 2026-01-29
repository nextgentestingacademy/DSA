package queue;

import java.util.ArrayDeque;

public class DequeExample {

	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		
		dq.addLast(10);
		dq.addFirst(20);
		dq.addLast(30);
		
		System.out.println("Deque contains:" + dq);
		
		System.out.println("Removed element from the first: " + dq.removeFirst());
		
		System.out.println("Removed element from the last: " + dq.removeLast());
		
		System.out.println("Deque contains:" + dq);
	}
}
