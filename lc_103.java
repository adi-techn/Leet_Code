import java.util.*;

import javax.swing.tree.TreeNode;

public class lc_103 {
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
     public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root==null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> arr=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode currNode=q.remove();
                arr.add(currNode.val);
                
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
            result.add(arr);
        }
        for(int i=0;i<result.size();i++){
            if(i%2!=0){
                Collections.reverse(result.get(i));
            }
        }
        return result;
     }
     public static void main(String[] args) {
          TreeNode root=new TreeNode(1);
          root.left=new TreeNode(2);
          root.left.left=new TreeNode(4);
          root.left.right=new TreeNode(5);
          root.right=new TreeNode(6);
        
          System.out.println(zigzagLevelOrder(root));
     }
}
