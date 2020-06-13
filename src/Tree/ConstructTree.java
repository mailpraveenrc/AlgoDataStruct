package Tree;

import java.util.HashMap;

public class ConstructTree {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

        int post_size;
        int[] postorder;
        int[] inorder;
        HashMap<Integer, Integer> inorder_map = new HashMap<Integer, Integer>();


        public TreeNode buildTree(int[] inorder, int[] postorder) {
            this.postorder = postorder;
            this.inorder = inorder;
            // start from the last postorder element
            post_size = postorder.length - 1;

            // build a hashmap value -> its index
            int idx = 0;
            for (Integer val : inorder){
                inorder_map.put(val, idx++);
            }
            return helper(0, inorder.length - 1);
        }


        public TreeNode helper(int left_index, int right_index) {
            // if there is no elements to construct subtrees
            if (left_index > right_index)
                return null;

            // pick up post_idx element as a root
            int root_val = postorder[post_size];
            TreeNode root = new TreeNode(root_val);

            // root splits inorder list
            // into left and right subtrees
            int index = inorder_map.get(root_val);

            // recursion 
            post_size--;
            // build right subtree
            root.right = helper(index + 1, right_index);
            // build left subtree
            root.left = helper(left_index, index - 1);
            return root;
        }

        public static void main(String[] args) {
            ConstructTree obj = new ConstructTree();
            int[] a = new int[]{9,3,15,20,7};
            int[] b = new int[]{9,15,7,20,3};
            System.out.println("????????????"+obj.buildTree(a,b));
        }
    }

