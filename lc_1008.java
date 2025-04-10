import javax.swing.tree.TreeNode;

public class lc_1008 {
     static class TreeNode{
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int val){
               this.val=val;
          }
     }
     public static TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;

        for(int i=0;i<preorder.length;i++){
            root=build(root,preorder[i]);
        }
        return root;
     }
     public static TreeNode build(TreeNode root,int val){
        if(root==null){
            root=new TreeNode(val);
            return root;
        }
        if(val<root.val){
            root.left=build(root.left,val);
        }
        else{
            root.right=build(root.right,val);
        }
        return root;
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
          int values[]={5,4,1,2,3};
          TreeNode root=bstFromPreorder(values);
          inorder(root);
          
     }
}
