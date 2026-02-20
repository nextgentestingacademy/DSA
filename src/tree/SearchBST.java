package tree;

class NodeSearch {
    int data;
    NodeSearch left, right;

    NodeSearch(int value) {
        data = value;
        left = right = null;
    }
}

public class SearchBST {

    // Function to search a key in BST
    static boolean search(NodeSearch root, int key) {
        // If root is null → key not found
        if (root == null) {
            return false;
        }

        // If root's data matches key → found
        if (root.data == key) {
            return true;
        }

        // If key is smaller than root → search left subtree
        if (key < root.data) {
            return search(root.left, key);
        }

        // Else search right subtree
        return search(root.right, key);
    }

    public static void main(String[] args) {
        /*
                   50
                 /    \
                30     70
               / \    / \
              20  40  60  80
        */
        NodeSearch root = new NodeSearch(50);
        NodeSearch first = new NodeSearch(30);
        NodeSearch second = new NodeSearch(70);
        NodeSearch third = new NodeSearch(20);
        NodeSearch fourth = new NodeSearch(40);
        NodeSearch fifth = new NodeSearch(60);
        NodeSearch sixth = new NodeSearch(80);
        
        root.left = first;
        root.right = second;
        first.left = third;
        first.right = fourth;
        second.left = fifth;
        second.right = sixth;

        int key = 40;

        // Search for key
        if (search(root, key)) {
            System.out.println(key + " is found in the BST.");
        } else {
            System.out.println(key + " is NOT found in the BST.");
        }
    }
}
