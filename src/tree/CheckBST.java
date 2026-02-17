package tree;

import java.util.ArrayList;
import java.util.Collections;

class NodeBST{
	int data;
	NodeBST left, right;
	
	
	NodeBST(int value){
		data = value;
		left = right = null;
	}
	
}


public class CheckBST {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	//left --> root --> right
	static void inorder(NodeBST root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			list.add(root.data);
			inorder(root.right);
		}
	}
	
	
	
	public static void main(String[] args) {

		//Standalone nodes
		
		NodeBST root = new NodeBST(50);
		NodeBST first = new NodeBST(30);
		NodeBST second = new NodeBST(70);
		NodeBST third = new NodeBST(20);
		NodeBST fourth = new NodeBST(40);
		NodeBST fifth = new NodeBST(60);
		NodeBST sixth = new NodeBST(80);
		
		//link nodes to each other
		root.left=first;
		root.right=second;
		first.left=third;
		first.right=fourth;
		second.left=fifth;
		second.right=sixth;
		
		inorder(root);
		
		
		//storing the original sequence of inorder in origList
		ArrayList<Integer> origList = new ArrayList<Integer>();
		
		for(int i: list) {
			origList.add(i);
		}
		
		//sort the other list
		Collections.sort(list);
		
		
		//compare both the lists
		if(list.equals(origList)) {
			System.out.println("\nThis tree is a Binary Search Tree");
		}else {
			System.out.println("\nThis tree is NOT a Binary Search Tree");
		}
		
		//clear both the lists
		list.clear();
		origList.clear();
		
		
		//Standalone nodes
		
		NodeBST root2 = new NodeBST(50);
		NodeBST first2 = new NodeBST(70);
		NodeBST second2 = new NodeBST(90);
		NodeBST third2 = new NodeBST(20);
		NodeBST fourth2 = new NodeBST(40);
		
		//link nodes to each other
		root2.left=first2;
		root2.right=second2;
		first2.left=third2;
		first2.right=fourth2;
		
		inorder(root2);
		
		
		//storing the original sequence of inorder in origList
		for(int i: list) {
			origList.add(i);
		}
		
		//sort the other list
		Collections.sort(list);
		
		
		//compare both the lists
		if(list.equals(origList)) {
			System.out.println("\nThis tree is a Binary Search Tree");
		}else {
			System.out.println("\nThis tree is NOT a Binary Search Tree");
		}
		
		//clear both the lists
		list.clear();
		origList.clear();		
		
		
	}

}
