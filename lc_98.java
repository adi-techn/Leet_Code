import javax.swing.tree.TreeNode;

public class lc_98 {
     static class TreeNode{
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int val){
               this.val=val;
          }
     }
     public static boolean isValidBST(TreeNode root) {
          return isValid(root,null,null);
     }
     public static boolean isValid(TreeNode root,TreeNode min,TreeNode max){
        if(root==null){
            return true;
        }
        if(min!=null && root.val<=min.val){
            return false;
        }
        if(max!=null && root.val>=max.val){
            return false;
        }
        return isValid(root.left,min,root) && isValid(root.right,root,max);
     }
     public static void main(String[] args) {
          TreeNode root=new TreeNode(3);
          root.left=new TreeNode(1);
          root.left.right=new TreeNode(2);
          root.right=new TreeNode(5);

          System.out.println(isValidBST(root));
     }
}
