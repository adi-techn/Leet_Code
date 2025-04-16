import java.util.*;

import javax.swing.tree.TreeNode;

public class lc_2476{
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
    public static List<List<Integer>> closestNodes(TreeNode root, List<Integer> que) {
        inorder(root);
        List<List<Integer>> answer=new ArrayList<>();

        for(int i=0;i<que.size();i++){
            int val=que.get(i);
            int si=0,ei=arr.size()-1;
            int floor=-1,ceil=-1;
            ArrayList<Integer> ans=new ArrayList<>();
            while(si<=ei){
                int mid=(si+ei)/2;
                if(arr.get(mid)<=val) {
                    floor=arr.get(mid);
                    si=mid+1;
                }
                else{
                    ei=mid-1;
                }
            }
            ans.add(floor);

            si=0;ei=arr.size()-1;
            while(si<=ei){
                int mid=(si+ei)/2;
                if(arr.get(mid)>=val) {
                    ceil=arr.get(mid);
                    ei=mid-1;
                }
                else{
                    si=mid+1;
                }
            }
            ans.add(ceil);
            answer.add(ans);
        }
        return answer;
    }
    static ArrayList<Integer> arr=new ArrayList<>();
    public static void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(6);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(4);
        root.right=new TreeNode(13);
        root.right.left=new TreeNode(9);
        root.right.right=new TreeNode(15);
        root.right.right.left=new TreeNode(14);
        
        ArrayList<Integer> que=new ArrayList<>();
        que.add(2);que.add(5);que.add(16);
        System.out.println(closestNodes(root,que));
    }
}