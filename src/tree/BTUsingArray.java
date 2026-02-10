package tree;

public class BTUsingArray {
	int[] tree;
	int size;
	
	BTUsingArray(int value){
		tree = new int[value];
		size=0;
	}
	
	void insert(int val) {
		
		if(size>=tree.length) {
			System.out.println("Tree is already full");
			return;
		}
		
		tree[size] = val;
		size++;
	}
	
	void display() {
		for(int i=0; i<size;i++) {
			System.out.print(tree[i] + " ");
		}
	}

	public static void main(String[] args) {
		BTUsingArray bt = new BTUsingArray(5);
		bt.insert(12);
		bt.insert(2);
		bt.insert(30);
		bt.insert(3);
		bt.insert(7);
		bt.insert(70);
		bt.display();
	}
}