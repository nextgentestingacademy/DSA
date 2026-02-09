package linkedList;

public class InsertEnd {

	public static void main(String[] args) {
		
		//create stand alone nodes
		NodeSimpleLL first = new NodeSimpleLL (10);
		NodeSimpleLL second = new NodeSimpleLL (20);
		NodeSimpleLL third = new NodeSimpleLL (30);
		
		//link the nodes
		first.next = second;
		second.next = third;
		
		System.out.println("Traversing the Linked List:");
		//create a reference variable to traverse the list
		NodeSimpleLL current = first;

		//traverse the list until current becomes null
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
		NodeSimpleLL newNode = new NodeSimpleLL(5);
		third.next = newNode; //point the third node to the new node of the list
		
		current = first;
		System.out.println("Traversing the Linked List after inserting at the end:");
		//traverse the list until current becomes null
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}
