package tree;

class NodeDelete {
    int data;
    NodeDelete left, right;

    public NodeDelete(int value) {
        data = value;
        left = right = null;
    }
}

class DeleteBST {
    NodeDelete root;

    // Insert values in tree
    NodeDelete insert(NodeDelete root, int value) {
    	 if (root == null) {
             return new NodeDelete(value);
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

    // Delete method
    NodeDelete deleteNode(NodeDelete root, int val) {
        if (root == null) return root;

        // Traverse the tree
        if (val < root.data) {
            root.left = deleteNode(root.left, val);
        } else if (val > root.data) {
            root.right = deleteNode(root.right, val);
        } else {
            // Found the NodeDelete to delete

            // CASE 1: NodeDelete has no child (leaf NodeDelete)
            if (root.left == null && root.right == null) {
                return null;
            }

            // CASE 2: NodeDelete has only one child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // CASE 3: NodeDelete has two children
            root.data = minValue(root.right); // find inorder predecessor
            root.right = deleteNode(root.right, root.data); // delete original inorder predecessor
        }
        return root;
    }

    // Find the minimum value NodeDelete in a tree
    int minValue(NodeDelete root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    // Inorder Traversal (for checking result)
    void inorder(NodeDelete root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Main Method
    public static void main(String[] args) {
    	DeleteBST tree = new DeleteBST();

        // Insert elements
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        System.out.println("Inorder traversal before deletion:");
        tree.inorder(tree.root);
        System.out.println();

        // CASE 1: Delete leaf NodeDelete
        tree.root = tree.deleteNode(tree.root, 20);
        System.out.println("After deleting 20 (leaf NodeDelete):");
        tree.inorder(tree.root);
        System.out.println();

        // CASE 2: Delete NodeDelete with one child
        tree.root = tree.deleteNode(tree.root, 30);
        System.out.println("After deleting 30 (NodeDelete with one child):");
        tree.inorder(tree.root);
        System.out.println();

        // CASE 3: Delete NodeDelete with two children (root NodeDelete 50)
        tree.root = tree.deleteNode(tree.root, 50);
        System.out.println("After deleting 50 (NodeDelete with two children):");
        tree.inorder(tree.root);
        System.out.println();
    }
}

