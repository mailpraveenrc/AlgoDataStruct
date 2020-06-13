class BinarySearchTree {

    /* Class containing left and right child of current node and key value*/
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST 
    Node root;

    // Constructor 
    BinarySearchTree() {
        root = null;
    }

    // This method mainly calls insertRec() 
    void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec() 
    void inorder()  {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST 
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    public boolean isValidBST() {
        Node current = root;
        return eval(current);
    }

    private boolean eval(Node current){
        if(current ==null) return true;
        if(current.left != null){
            if(current.left.key >= current.key) return false;
        }
        if(current.right != null){
            if(current.right.key <= current.key) return false;
        }
        if(current.left != null){
            eval(current.left);
        }
        if(current.right != null){
            eval(current.right);
        }
        return true;
    }

    // Driver Program to test above functions 
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(); 
  
        /* Let us create following BST 
              50 
           /     \ 
          30      70 
         /  \    /  \ 
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST 
        tree.inorder();
        System.out.println(tree.isValidBST());
    }
}
// This code is contributed by Ankur Narain Verma