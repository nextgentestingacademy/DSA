package queue;

public class CircularQueue {
	int[] queue;
	int front, size, rear, capacity;
	
	public CircularQueue(int cap) {
		queue = new int[cap];
		capacity = cap;
		front=0;
		size=0;
		rear=-1;
	}
	
	public void enqueue(int data) {
		
		if(size == capacity) {
			System.out.println("Queue is already full");
			return;
		}
		rear = (rear +1)% capacity;
		queue[rear]=data;
		size++;
	}
	
	public int dequeue() {
		if(size==0) {
			System.out.println("Queue is already empty");
			return -1;
		}
		
		int value = queue[front];
		front = (front + 1) % capacity;
		size--;
		return value;
	}

	public void display() {
		int count = size;
		int i = front;
		
		while(count >0) {
			System.out.print(queue[i] + " ");
			i = (i + 1)% capacity;
			count--;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(3);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(40);
		q.display();
		q.enqueue(50);
	}

}
