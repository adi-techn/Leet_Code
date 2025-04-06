import java.util.*;

import javax.swing.tree.TreeNode;

public class lc_1161 {
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
     public static int maxLevelSum(TreeNode root) {
          ArrayList<Integer> arr=levelOrder(root);
          int max=Integer.MIN_VALUE;
          int idx=0;
          for(int i=0;i<arr.size();i++){
               if(max<arr.get(i)){
                    max=arr.get(i);
                    idx=i+1;
               }
          }
          return idx;
    }
    public static ArrayList<Integer> levelOrder(TreeNode root){
          ArrayList<Integer> arr=new ArrayList<>();
          if(root==null){
               return arr;
          }

          Queue<TreeNode> q=new LinkedList<>();
          q.add(root);

          while(!q.isEmpty()){
               int size=q.size();
               int sum=0;

               for(int i=0;i<size;i++){
                    TreeNode currNode=q.remove();
                    sum+=currNode.val;

                    if(currNode.left!=null){
                         q.add(currNode.left);
                    }
                    if(currNode.right!=null){
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
        
          System.out.println(maxLevelSum(root));
     }
}
