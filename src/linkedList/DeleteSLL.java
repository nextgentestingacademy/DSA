package linkedList;


public class DeleteSLL {
	public static void main(String[] args) {
		//create stand alone nodes
		NodeSimpleLL first = new NodeSimpleLL (10);
		NodeSimpleLL second = new NodeSimpleLL (20);
		NodeSimpleLL third = new NodeSimpleLL (30);
		NodeSimpleLL fourth = new NodeSimpleLL (40);
		NodeSimpleLL fifth = new NodeSimpleLL (50);
		
		//link the nodes
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		System.out.println("Traversing the Linked List:");
		//create a reference variable to traverse the list
		NodeSimpleLL current = first;

		//traverse the list until current becomes null
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
		//delete first node
		current = second;
		//traverse the list until current becomes null
		System.out.println("Traversing the Linked List after deleting first node:");
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
		//delete last node
		fourth.next = null;
		current = second;
		//traverse the list until current becomes null
		System.out.println("Traversing the Linked List after deleting last node:");
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
		//delete a node between two nodes
		second.next = fourth;
		current = second;
		//traverse the list until current becomes null
		System.out.println("Traversing the Linked List after deleting a node between two nodes:");
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}
