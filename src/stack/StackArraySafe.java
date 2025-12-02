package stack;

public class StackArraySafe {

	private int[] stack;
	private int top;
	
	public StackArraySafe(int size) {
		stack = new int[size];
		top=-1;
	}
	
	public void push(int value) {
		if(top == stack.length-1) {
			System.out.println("Overflow: Stack is already full");
			return;
		}
		top++;
		stack[top]=value; //push operation
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("Underflow: Stack is already empty");
			return -1;
		}
		int value = stack[top];
		top--; //pop
		return value;//value that has been popped out
	}
	
	public int peek() {
		if(top == -1) {
			System.out.println("Underflow: Stack is already empty");
			return -1;
		}
		return stack[top];//value that has to be peeked
	}
	
	public static void main(String[] args) {
		StackArraySafe s = new StackArraySafe(3);
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println("Peeked: " + s.peek());
		
		System.out.println("Popped out: " + s.pop());
		System.out.println("Popped out: " + s.pop());
		System.out.println("Popped out: " + s.pop());
		System.out.println("Popped out: " + s.pop());
	}
}
