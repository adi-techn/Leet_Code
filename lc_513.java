import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class lc_513 {
     static class TreeNode{
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int val){
               this.val=val;
          }
     }
     public static int findBottomLeftValue(TreeNode root) {
        traverse(root);
        int idx=result.size()-1;

        return result.get(idx).get(0);
     }
     static List<List<Integer>> result=new ArrayList<>();
     public static void traverse(TreeNode root){
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

          System.out.println(findBottomLeftValue(root));
     }
}
