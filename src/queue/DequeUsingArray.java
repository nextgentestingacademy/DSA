package queue;

public class DequeUsingArray {
	int size;
	int deque[];
	int front;
	int rear;
	
	public DequeUsingArray(int length) {
		deque = new int[length];
		front = 0;
		rear = -1;
		size = length;
	}
	
	public boolean isEmpty() {
		return (front > rear);
	}
	
	public boolean isFull() {
		return (size == rear-1);
	}
	
	public void insertAtRear(int value) {
		if(isFull()) {
			System.out.println("Deque is already full");
			return;
		}
		
		rear++;
		deque[rear]=value;
		System.out.println("Value inserted at rear: " + value);
	}
	
	
	public void insertAtFront(int value) {
		if(front == 0) {
			System.out.println("No space. Cannot insert at front");
			return;
		}
		
		front--;
		deque[front] = value;
		System.out.println("Value inserted at front: " + value);
	}

	public void deleteFromRear() {
		if(isEmpty()) {
			System.out.println("Deque is already empty");
			return;
		}
		System.out.println("Value deleted from rear: " + deque[rear]);
		
		rear--;
	}
	
	public void deleteFromFront() {
		if(isEmpty()) {
			System.out.println("Deque is already empty");
			return;
		}
		System.out.println("Value deleted from front: " + deque[front]);
		
		front++;
	}
	
	public void getFront() {
		if(isEmpty()) {
			System.out.println("Deque is already empty");
			return;
		}
		System.out.println("Value at front: " + deque[front]);
	}
	
	public void getRear() {
		if(isEmpty()) {
			System.out.println("Deque is already empty");
			return;
		}
		System.out.println("Value at rear: " + deque[rear]);
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Deque is already empty");
			return;
		}
		
		for(int i=front;i<=rear;i++) {
			System.out.print(" " + deque[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		DequeUsingArray dq = new DequeUsingArray(5);
		
		dq.insertAtRear(10);
		dq.insertAtRear(20);
		dq.insertAtRear(30);
		dq.display();
		
		dq.deleteFromFront();
		dq.display();
		
		dq.insertAtFront(50);
		dq.display();
		
		dq.deleteFromRear();
		dq.display();
		
		dq.getFront();
		dq.getRear();
		
	}

}
