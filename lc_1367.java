import java.util.*;

public class lc_1367{
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;
        return dfs(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }
    private boolean dfs(ListNode head, TreeNode node) {
        if (head == null) return true;
        if (node == null) return false;
        if (head.val != node.val) return false;
        return dfs(head.next, node.left) || dfs(head.next, node.right);
    }

    public static ListNode convertToListNode(LinkedList<Integer> list) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : list) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(6);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(13);
        root1.left.left = new TreeNode(5);
        root1.right.right = new TreeNode(17);

        LinkedList<Integer> l = new LinkedList<>();
        l.add(6);
        l.add(2);

        ListNode head = convertToListNode(l);

        System.out.println(isSubPath(head, root1));
    }
}
