import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class lc_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode currNode = q.remove();
                arr.add(currNode.val);

                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            result.add(arr);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,new TreeNode(2, new TreeNode(4), new TreeNode(5)), 
                         new TreeNode(3, null, new TreeNode(6)));

        lc_102 lc_102= new lc_102();
        List<List<Integer>> result =lc_102.levelOrder(root);

        System.out.println(result);
    }
}
