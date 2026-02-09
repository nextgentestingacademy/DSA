package linkedList;

class NodeSimpleLL {
	int data;
	NodeSimpleLL next;
	
	NodeSimpleLL(int value){
		data = value;
		next = null;
	}
}

public class SimpleLL {
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
	}
}
