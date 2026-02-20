package tree;

import java.util.ArrayList;
import java.util.Collections;

class NodeBST {
    int data;
    NodeBST left, right;

    NodeBST(int value) {
        data = value;
        left = right = null;
    }
}

public class CheckBST {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
  //left --> root --> right
    static void inorder(NodeBST root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            list.add(root.data);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        // Example 1: This IS a BST
        /*
                   50
                 /    \
                30     70
               / \    / \
              20  40  60  80
        */
    	
    	//create stand alone nodes
        NodeBST root = new NodeBST(50);
        NodeBST first = new NodeBST(30);
        NodeBST second = new NodeBST(70);
        NodeBST third = new NodeBST(20);
        NodeBST fourth = new NodeBST(40);
        NodeBST fifth = new NodeBST(60);
        NodeBST sixth = new NodeBST(80);
        
        //link nodes to each other
        root.left = first;
        root.right = second;
        first.left = third;
        first.right = fourth;
        second.left = fifth;
        second.right = sixth;
        
        //print the inorder sequence
        inorder(root);
        //store the inorder sequence in an array list
        ArrayList<Integer> origList = new ArrayList<Integer>();
        for(int i: list) {
        	origList.add(i);
        }
        //sort the inorder sequence
        Collections.sort(list);
        
        //if the inorder sequence array list matches the sorted list then it is BST, else NO
        if(list.equals(origList)) {
        	System.out.println("\nThis Tree is a Binary Search Tree");
        }else {
        	System.out.println("\nThis Tree is NOT a Binary Search Tree");
        }
        
        //clear both lists
        list.clear();
        origList.clear();

        // Example 2: This is NOT a BST
        /*
                   50
                 /    \
                30     70
                   \
                    90   <-- Violates BST property
        */
        NodeBST root2 = new NodeBST(50);
        NodeBST first2 = new NodeBST(30);
        NodeBST second2 = new NodeBST(70);
        NodeBST third2 = new NodeBST(90);
        
        root2.left = first2;
        root2.right = second2;
        first2.right = third2;  // wrong placement

        inorder(root2);
        for(int i: list) {
        	origList.add(i);
        }
        Collections.sort(list);
        
        if(list.equals(origList)) {
        	System.out.println("\nThis Tree is a Binary Search Tree");
        }else {
        	System.out.println("\nThis Tree is NOT a Binary Search Tree");
        }
    }
}

