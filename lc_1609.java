import java.util.*;

import javax.swing.tree.TreeNode;

public class lc_1609 {
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
     public static boolean isEvenOddTree(TreeNode root) {
        levelOrder(root);
        for(int i=0;i<result.size();i++){
            for(int j=0;j<result.get(i).size()-1;j++){
                int n1=result.get(i).get(j);
                int n2=result.get(i).get(j+1);
                if(i%2==0 && (!(n1%2!=0 || n2%2!=0) || !(n1<n2))){
                    return false;
                }
                if(i%2!=0 && (!(n1%2==0 || n2%2==0) || !(n1>n2))){
                    return false;
                }
            }
        }
        return true;
     }
     static List<List<Integer>> result=new ArrayList<>();
     public static void levelOrder(TreeNode root){
        if(root==null){
            return;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> arr=new ArrayList<>();
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
     }
     public static void main(String[] args) {
          TreeNode root=new TreeNode(1);
          root.left=new TreeNode(2);
          root.left.left=new TreeNode(4);
          root.left.right=new TreeNode(5);
          root.right=new TreeNode(6);
          
          System.out.println(isEvenOddTree(root));
     }
}
