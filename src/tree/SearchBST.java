package tree;

class NodeSearch{
	int data;
	NodeSearch left, right;
	
	NodeSearch(int value){
		data = value;
		left = right = null;
	}
}


public class SearchBST {

	static boolean search(NodeSearch root, int key) {
	
		if(root == null) {
			return false;
		}
		
		if(root.data == key) {
			return true;
		}
		
		if(key < root.data) {
			return search(root.left, key);
		}
		return search(root.right,key);
	}
	
	public static void main(String[] args) {
		//Standalone nodes
		NodeSearch root = new NodeSearch(50);
		NodeSearch first = new NodeSearch(30);
		NodeSearch second = new NodeSearch(70);
		NodeSearch third = new NodeSearch(20);
		NodeSearch fourth = new NodeSearch(40);
		NodeSearch fifth = new NodeSearch(60);
		NodeSearch sixth = new NodeSearch(80);
		
		//link nodes to each other
		root.left=first;
		root.right=second;
		first.left=third;
		first.right=fourth;
		second.left=fifth;
		second.right=sixth;
		
		int key = 170;
		
		if(search(root, key)) {
			System.out.println(key + " is found in this BST");
		}else {
			System.out.println(key + " is NOT found in this BST");
		}
		
	}

}
