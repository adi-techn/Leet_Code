import java.util.*;

import javax.swing.tree.TreeNode;

public class lc_1022{
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
     public static int sumRootToLeaf(TreeNode root) {
        traverse(root,0);
        int sum=0;
        for(int i=0;i<arr.size();i++){
            int n=arr.get(i);
            int m=0,j=0;
            while(n!=0){
                int r=n%10;
                n/=10;
                m+=(r*Math.pow(2,j++));
            }
            sum+=m;
        }
        return sum;
     }
     static ArrayList<Integer> arr=new ArrayList<>();
     public static void traverse(TreeNode root,int num){
        if(root==null){
            return;
        }
        num=num*10+root.val;
        if(root.left==null && root.right==null){
            arr.add(num);
            return;
        }
        traverse(root.left,num);
        traverse(root.right,num);
     }
     public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(0);
        root.left.left=new TreeNode(0);
        root.left.right=new TreeNode(1);
        root.right=new TreeNode(1);
        root.right.left=new TreeNode(0);
        root.right.right=new TreeNode(1);
        
        
        System.out.println(sumRootToLeaf(root));
     }
}
