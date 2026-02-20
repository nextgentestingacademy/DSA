package tree;

// Class representing a NodeI in the BST
class NodeI {
    int data;
    NodeI left, right;

    public NodeI(int item) {
        data = item;
        left = right = null;
    }
}

// Insert Binary Search Tree class
class InsertBST {

    NodeI root;

    // Recursive function to insert a new value
    static NodeI insert(NodeI root, int value) {

        // Base case: if tree is empty, create new NodeI
        if (root == null) {
            return new NodeI(value);
        }

        // If key is smaller, go left
        if (value < root.data) {
            root.left = insert(root.left, value);
        }
        // If key is greater, go right
        else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        // Return root unchanged
        return root;
    }

    // Inorder traversal (Left -> Root -> Right)
    static void inorder(NodeI root) {

        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Main method
    public static void main(String[] args) {

        InsertBST tree = new InsertBST();

        // Insert Nodes (IMPORTANT: assign returned value to root)
        tree.root = insert(tree.root, 50);
        tree.root = insert(tree.root, 30);
        tree.root = insert(tree.root, 70);
        tree.root = insert(tree.root, 20);
        tree.root = insert(tree.root, 40);
        tree.root = insert(tree.root, 60);
        tree.root = insert(tree.root, 80);

        System.out.println("Inorder traversal of the BST:");
        inorder(tree.root);
    }
}
