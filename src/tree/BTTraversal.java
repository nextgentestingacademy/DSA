package tree;

class NodeTraverse{
	int data;
	NodeTraverse left;
	NodeTraverse right;
	
	NodeTraverse(int value){
		data = value;
		left = right = null;
	}
}


public class BTTraversal {

	//root --> left --> right
	static void preorder(NodeTraverse root) {
		if(root == null) {
			return;
		}
		//root
		System.out.print(root.data + " ");
		//left
		preorder(root.left);
		//right
		preorder(root.right);
	}
	
	
	//left --> right --> root
	static void postorder(NodeTraverse root) {
		if(root == null) {
			return;
		}
		//left
		postorder(root.left);
		//right
		postorder(root.right);
		//root
		System.out.print(root.data + " ");
	}
	
	//left --> root --> right 
	static void inorder(NodeTraverse root) {
		if(root == null) {
			return;
		}
		//left
		inorder(root.left);
		//root
		System.out.print(root.data + " ");
		//right
		inorder(root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeTraverse root = new NodeTraverse(1);
		NodeTraverse first = new NodeTraverse(2);
		NodeTraverse second = new NodeTraverse(3);
		NodeTraverse third = new NodeTraverse(4);
		NodeTraverse fourth = new NodeTraverse(5);
		NodeTraverse fifth = new NodeTraverse(6);
		
		root.left = first;
		root.right = second;
		first.left = third;
		first.right = fourth;
		second.left = fifth;
		
		System.out.print("Preorder Traversal: ");
		preorder(root);
		System.out.println();
		
		System.out.print("Postorder Traversal: ");
		postorder(root);
		System.out.println();
		
		System.out.print("Inorder Traversal: ");
		inorder(root);
	}
}
