package tree;

class Node {
	int data;
	Node left;
	Node right;
	
	Node(int value){
		data=value;
		left = null;
		right = null;
	}
}

public class BTUsingLinkedList {

	public static void main(String[] args) {

		//stand alone nodes created
		Node root = new Node(2);
		Node first = new Node(1);
		Node second = new Node(4);
		Node third = new Node(11);
		Node fourth = new Node(12);
		Node fifth = new Node(3);
		
		//link node to each other;
		root.left = first;
		root.right = second;
		first.left = third;
		first.right = fourth;
		second.right = fifth;

		//Traverse through the tree nodes
		System.out.println("Traversing the tree");
		System.out.println("Root node: " + root.data);
		System.out.println("Left of the root node: " + first.data);
		System.out.println("Right of the root node: " + second.data);
		System.out.println("Left of the first node: " + third.data);
		System.out.println("Right of the first node: " + fourth.data);
		System.out.println("Right of the second node: " + fifth.data);
	}
}
