public class lc_938 {
     static class TreeNode{
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int val){
               this.val=val;
          }
     }
     static int sum=0;
     public static int rangeSumBST(TreeNode root, int k1, int k2) {
        if(root==null){
            return 0;
        }
        if(k1<=root.val && root.val<=k2){
            rangeSumBST(root.left,k1,k2);
            sum+=root.val;
            rangeSumBST(root.right,k1,k2);
        }
        else if(root.val>k1){
            rangeSumBST(root.left,k1,k2);
        }
        else{
            rangeSumBST(root.right,k1,k2);
        }
        return sum;
     }
     public static void main(String[] args) {
          TreeNode root=new TreeNode(1);
          root.left=new TreeNode(2);
          root.left.left=new TreeNode(4);
          root.left.right=new TreeNode(5);
          root.right=new TreeNode(6);

          System.out.println(rangeSumBST(root,4,6));
     }
}
