import java.util.*;
import javax.swing.tree.TreeNode;

public class lc_113{
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
     static int target;
     static List<List<Integer>> result=new ArrayList<>();
     public static List<List<Integer>> pathSum(TreeNode root,int targetSum){
          target=targetSum;
          ArrayList<Integer> arr=new ArrayList<>();
          traverse(root,0,arr);
          return result;
     }
     public static void traverse(TreeNode root,int sum,ArrayList<Integer> arr){
          if(root==null){
               return;
          }
          sum+=root.val;
          arr.add(root.val);
          if(root.left==null && root.right==null){
               if(sum==target){
                    result.add(new ArrayList<>(arr));
               }
               arr.remove(arr.size()-1);
               return;
          }
          traverse(root.left,sum, arr);
          traverse(root.right, sum, arr);

          arr.remove(arr.size()-1);
     }
     public static void main(String[] args) {
          TreeNode root=new TreeNode(1);
          root.left=new TreeNode(2);
          root.left.left=new TreeNode(4);
          root.left.right=new TreeNode(5);
          root.right=new TreeNode(6);
        
          System.out.println(pathSum(root,7));
     }
}
