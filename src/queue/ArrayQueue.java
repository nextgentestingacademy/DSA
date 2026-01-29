package queue;

public class ArrayQueue {
	//declaring a queue and counter variables
	int[] queue;
	int front, rear, size;
	
	public ArrayQueue(int capacity) {
		//initializing the array and counter variables
		queue = new int[capacity];
		front=0;
		rear=-1;
		size=0;
	}
	
	public void enqueue(int data) {
		//validate if queue is already full
		if(size == queue.length) {
			System.out.println("Queue is already full");
			return;
		}
		
		//if not full, increment the rear counter and insert the element in the rear index
		rear++;
		queue[rear]=data;
		size++;
	}
	
	public int dequeue() {
		//validate if queue is already empty
		if(size==0) {
			System.out.println("Queue is already empty");
			return -1;
		}
		
		//if not empty, remove the element which is at index front
		int removed = queue[front];
		front++;
		size--;
		return removed;
	}
	
	public void display() {
		for(int i=front;i<=rear;i++) {
			System.out.print(" " + queue[i]);
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		ArrayQueue q = new ArrayQueue(5);
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.display();
		
		q.dequeue();
		q.display();
	}
}