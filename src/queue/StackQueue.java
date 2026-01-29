package queue;

import java.util.Stack;

public class StackQueue {
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();
	
	public static void enqueue(int data) {
		s1.push(data);
	}

	public static int dequeue() {
		if(s1.isEmpty() && s2.isEmpty()) {
			System.out.println("Queue is already empty");
			return -1;
		}
		
		if(s2.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	
	public static void main(String[] args) {
		enqueue(10);
		enqueue(20);
		enqueue(30);
		
		System.out.println(dequeue());
		System.out.println(dequeue());
		System.out.println(dequeue());
		System.out.println(dequeue());
	}
}