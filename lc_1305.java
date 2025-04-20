import java.util.*;

import javax.swing.tree.TreeNode;

public class lc_1305 {
     static class TreeNode{
          int val;
          TreeNode left;
          TreeNode right;

          public TreeNode(int val){
               this.val=val;
          }
     }
     public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1=new ArrayList<>();
        inorder(root1,arr1);

        ArrayList<Integer> arr2=new ArrayList<>();
        inorder(root2,arr2);

        ArrayList<Integer> arr3=new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<arr2.get(j)){
                arr3.add(arr1.get(i));
                i++;
            }else{
                arr3.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            arr3.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            arr3.add(arr2.get(j));
            j++;
        }
        return arr3;
     }
     public static void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
     }
     public static void main(String[] args) {
          TreeNode root=new TreeNode(3);
          root.left=new TreeNode(1);
          root.left.right=new TreeNode(2);
          root.right=new TreeNode(5);

          TreeNode root1=new TreeNode(6);
          root1.left=new TreeNode(4);
          root1.left.right=new TreeNode(5);
          root1.right=new TreeNode(8);

          System.out.println(getAllElements(root, root1));
     }
}
