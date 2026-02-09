package linkedList;

public class CircularLL {

	public static void main(String[] args) {
		//create stand alone nodes
		NodeSimpleLL first = new NodeSimpleLL (10);
		NodeSimpleLL second = new NodeSimpleLL (20);
		NodeSimpleLL third = new NodeSimpleLL (30);
		
		//link the nodes
		first.next = second;
		second.next = third;
		third.next = first; //point the last node to the first node to make it circular
		
		NodeSimpleLL current = first;
		System.out.println("Traversing the Circular Linked List:");
		int count = 1;
		
		while(count <=4) {
			System.out.println(current.data);
			current = current.next;
			count++;
		}
	}
}
