import java.util.*;

import javax.swing.tree.TreeNode;

public class lc_2583 {
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
     public static long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList<Long> arr=levelOrder(root);
        Collections.sort(arr, Collections.reverseOrder());

        if(k>arr.size()){
            return -1;
        }
        return arr.get(k-1);
     }
     public static ArrayList<Long> levelOrder(TreeNode root) {
        ArrayList<Long> arr= new ArrayList<>();
        if (root==null) {
            return arr;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size=q.size();
            long sum=0;
            for (int i=0; i<size;i++) {
                TreeNode currNode = q.remove();
                sum+=currNode.val;

                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            arr.add(sum);
        }
        return arr;
     }
     public static void main(String[] args) {
          TreeNode root=new TreeNode(1);
          root.left=new TreeNode(2);
          root.left.left=new TreeNode(4);
          root.left.right=new TreeNode(5);
          root.right=new TreeNode(6);
        
          System.out.println(kthLargestLevelSum(root, 3));
     }
}
