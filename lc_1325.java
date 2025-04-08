import javax.swing.tree.TreeNode;

public class lc_1325{
     static class TreeNode{
          int val;
          TreeNode left;
          TreeNode right;
  
          TreeNode(int val){
               this.val=val;
               this.left=null;
               this.right=null;
          }
     }
     public static TreeNode removeLeafNodes(TreeNode root, int t) {
          if(root==null){
               return null;
          }

          root.left=removeLeafNodes(root.left, t);
          root.right=removeLeafNodes(root.right, t);

          if(root.left==null && root.right==null && root.val==t){
               return null;
          }
          return root;
     }
     public static void main(String[] args) {
          TreeNode root=new TreeNode(1);
          root.left=new TreeNode(2);
          root.left.left=new TreeNode(4);
          root.left.right=new TreeNode(5);
          root.right=new TreeNode(6);
        
          System.out.println(removeLeafNodes(root,4));
     }
}