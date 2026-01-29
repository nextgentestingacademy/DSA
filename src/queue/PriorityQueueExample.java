package queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(50);
		pq.add(100);
		pq.add(90);
		pq.add(70);
		pq.add(40);
		
		System.out.println("Elements in the priority queue: " + pq);
		int priority =0;
		while(!pq.isEmpty()) {
			priority++;
			System.out.println("Element served: " + pq.poll() + " with priority as " + priority);
		}
		
		System.out.println("Elements in the priority queue: " + pq);
		
	}

}
