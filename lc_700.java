import javax.swing.tree.TreeNode;

public class lc_700 {
     static class TreeNode{
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int val){
               this.val=val;
          }
     }
     public static TreeNode buildBST(TreeNode root,int val){
          if(root==null){
               root=new TreeNode(val);
               return root;
          }
          if(root.val>val){
               root.left=buildBST(root.left, val);
          }
          else{
               root.right=buildBST(root.right, val);
          }
          return root;
     }
     public static TreeNode searchBST(TreeNode root, int val) {
          if(root==null){
            return null;
          }
          if(root.val==val){
            return root;
          }
          if(val<root.val){
            return searchBST(root.left,val);
          }else{
            return searchBST(root.right,val);
          }
     }
     public static void inorder(TreeNode root){
          if(root==null){
               return;
          }
          inorder(root.left);
          System.out.print(root.val+" ");
          inorder(root.right);
     }
     public static void main(String[] args) {
          int values[]={4,2,7,1,3};
          TreeNode root=null;

          for(int i=0;i<values.length;i++){
               root=buildBST(root,values[i]);
          }
          inorder(searchBST(root, 2));
     }
}
