package tree;

class Node2 {
	int data;
	Node2 left, right;
	
	Node2(int value){
		data = value;
		left = right = null;
	}
}

public class InsertBST {

	Node2 root;
	
	//left --> root --> right
	static void inorder(Node2 root) {
		if(root !=null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
	
	static Node2 insert(Node2 root, int key) {
		//create a new node incase you hit null pointer
		if(root == null) {
			return new Node2(key);
		}
		
		//if value is less than root.data, traverse the left side of the BST 
		if(key<root.data) {
			root.left = insert(root.left,key);
		}
		
		//if value is greater than root.data, traverse the right side of the BST
		if(key>root.data) {
			root.right= insert(root.right,key);
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertBST tree = new InsertBST();
		tree.root = insert(tree.root, 50);
		tree.root = insert(tree.root, 30);
		tree.root = insert(tree.root, 20);
		tree.root = insert(tree.root, 70);
		tree.root = insert(tree.root, 90);
		
		System.out.println("Inorder traversal of this tree");
		inorder(tree.root);
	}
}