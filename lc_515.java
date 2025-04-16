import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class lc_515 {
     static class TreeNode{
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int val){
               this.val=val;
          }
     }
     public static List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<>();
        if (root==null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size=q.size();
            int max=Integer.MIN_VALUE;
            for (int i=0; i<size;i++) {
                TreeNode currNode=q.remove();
                if(max<currNode.val){
                    max=currNode.val;
                }
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            result.add(max);
        }
        return result;
     }
     public static void main(String[] args) {
          TreeNode root=new TreeNode(1);
          root.left=new TreeNode(2);
          root.left.left=new TreeNode(4);
          root.left.right=new TreeNode(5);
          root.right=new TreeNode(6);

          System.out.println(largestValues(root));
     }
}
