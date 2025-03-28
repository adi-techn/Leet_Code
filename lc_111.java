public class lc_111 {
     static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
 
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
 
     public static class MinDepth {
         static class Index {
             int value = 0;
         }
 
         public static TreeNode buildTree(int nodes[], Index index) {
             if (index.value >= nodes.length || nodes[index.value] == -1) {
                 index.value++;
                 return null;
             }
             TreeNode newNode = new TreeNode(nodes[index.value++]);
             newNode.left = buildTree(nodes, index);
             newNode.right = buildTree(nodes, index);
             return newNode;
         }
 
         public static int minDepth(TreeNode root) {
             if (root == null) {
                 return 0;
             }
             int left = minDepth(root.left);
             int right = minDepth(root.right);
 
             if (left == 0 || right == 0) {
                 return left + right + 1;
             } else {
                 return Math.min(left, right) + 1;
             }
         }
     }
 
     public static void main(String[] args) {
         int nodes[] = {3, 9, -1, -1, 20, 15, -1, -1, 7, -1, -1}; // -1 == null
         MinDepth min = new MinDepth();
         TreeNode root = min.buildTree(nodes, new MinDepth.Index());
         System.out.println("Minimum Depth: " + min.minDepth(root));
     }
 }
 