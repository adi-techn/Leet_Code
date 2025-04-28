import javax.swing.tree.TreeNode;

public class lc_2265 {
     static class TreeNode{
          int val;
          TreeNode left,right;
  
          TreeNode(int val) {
              this.val = val;
              this.left = null;
              this.right = null;
          }
     }
     static int c=0;
     public static int averageOfSubtree(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.val==sum(root)/size(root)){
            c++;
        }
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);

        return c;
     }
     public static int size(TreeNode root){
        if(root==null){
            return 0;
        }
        int lsize=size(root.left);
        int rsize=size(root.right);
        int size=lsize + rsize + 1;

        return size;
     }
     public static int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        int lsize=sum(root.left);
        int rsize=sum(root.right);
        int sum=lsize + rsize + root.val;

        return sum;
     }
     public static void main(String[] args) {
          TreeNode root=new TreeNode(4);
          root.left=new TreeNode(8);
          root.left.left=new TreeNode(0);
          root.left.right=new TreeNode(1);
          root.right=new TreeNode(5);
          root.right.right=new TreeNode(6);

          System.out.println(averageOfSubtree(root));
     }
}
