import java.util.*;

import javax.swing.tree.TreeNode;

public class lc_1123{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
             this.data=data;
             this.left=null;
             this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
             return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        int height=Math.max(left, right)+1;

        return height;
    }
    public static Node traversal(Node root,int ht,int len){
        if(root==null){
            return null;
        }
        if(ht==len){
            return root;
        }
        Node left=traversal(root.left, ht, len+1);
        Node right=traversal(root.right, ht, len+1);

        if(left!=null && right!=null){
            return root;
        }
        return (left != null)? left : right;
    }
    public static Node lcaDeepestLeaves(Node root) {
        int ht=height(root);
        return traversal(root, ht, 1);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
          root.left=new Node(2);
          root.left.left=new Node(4);
          root.left.right=new Node(5);
          root.right=new Node(6);
        
        System.out.println(lcaDeepestLeaves(root).data);
    }
}
