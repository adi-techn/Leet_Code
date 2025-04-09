import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class lc_129{
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
     public static int sumNumbers(TreeNode root) {
          num(root, 0);
          int sum=0;
          for(int i=0;i<arr.size();i++){
              sum+=arr.get(i);
          }
          return sum;
     }
     static ArrayList<Integer> arr=new ArrayList<>();
     public static void num(TreeNode root,int num){
          if(root==null){
              return;
          }
          num=num*10+root.val;
          if(root.left==null && root.right==null){
               arr.add(num);
          }
          num(root.left,num);
          num(root.right,num);
     }
     public static void main(String[] args) {
          TreeNode root=new TreeNode(1);
          root.left=new TreeNode(2);
          root.left.left=new TreeNode(4);
          root.left.right=new TreeNode(5);
          root.right=new TreeNode(6);
        
          System.out.println(sumNumbers(root));
     }
}
