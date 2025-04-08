import javax.swing.tree.TreeNode;

public class lc_112{
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
     static int t;
     public static boolean pathSum(TreeNode root,int target){
          t=target;
          return traverse(root,0);
     }
     public static boolean traverse(TreeNode root,int sum){
          if(root==null){
               return false;
          }
          sum+=root.val;
          if(root.left==null && root.right==null){
               return sum==t;
          }
          boolean lsum=traverse(root.left, sum);
          boolean rsum=traverse(root.right, sum);

          return lsum || rsum;
     }
     public static void main(String[] args) {
          TreeNode root=new TreeNode(1);
          root.left=new TreeNode(2);
          root.left.left=new TreeNode(4);
          root.left.right=new TreeNode(5);
          root.right=new TreeNode(6);
        
          System.out.println(pathSum(root,4));
     }
}