import java.util.ArrayList;
import java.util.List;

public class lc_94{
    static class TreeNode{
        int val;
        TreeNode left,right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static TreeNode buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) { 
                return null;
            }
            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left = buildTree(nodes);  // Left subtree
            newNode.right = buildTree(nodes); // Right subtree
            return newNode;
        }

        public static List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> arr = new ArrayList<>();
            inorder(root, arr);
            return arr;
        }

        private static void inorder(TreeNode root, List<Integer> arr) {
            if (root == null) return;
            inorder(root.left, arr);
            arr.add(root.val);
            inorder(root.right, arr);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, -1, 2, 3};
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.buildTree(nodes);
        System.out.println(tree.inorderTraversal(root));
    }
}