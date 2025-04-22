import java.util.*;

import javax.swing.tree.TreeNode;

public class lc_606{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val=val;
        }
    }
    public static String tree2str(TreeNode root) {
        preorder(root);
        return sb.toString();
    }
    static StringBuilder sb=new StringBuilder();
    public static void preorder(TreeNode root){
        if(root==null){
            return;
        }
        sb.append(root.val);

        if(root.left!=null || root.right!=null){
            sb.append('(');
            preorder(root.left);
            sb.append(')');
        }
        if(root.right!=null){
            sb.append('(');
            preorder(root.right);
            sb.append(')');
        }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.right=new TreeNode(4);
        root.right=new TreeNode(3);

        System.out.println(tree2str(root));
    }
}
