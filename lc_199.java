import java.util.*;
import javax.swing.tree.TreeNode;

public class lc_199 {
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
     public static List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> arr=levelOrder(root);
        return arr; 
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
            int rightNum=0;
            for(int i=0;i<size;i++){
                TreeNode currNode=q.remove();
                rightNum=currNode.val;

                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
            arr.add(rightNum);
        }
        return arr;
     }
     public static void main(String[] args) {
          TreeNode root=new TreeNode(1);
          root.left=new TreeNode(2);
          root.left.left=new TreeNode(4);
          root.left.right=new TreeNode(5);
          root.right=new TreeNode(6);
        
          System.out.println(rightSideView(root));
     }
}
