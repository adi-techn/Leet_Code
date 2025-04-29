import java.util.*;

public class lc_429 {
     static class Node {
          public int val;
          public List<Node> children;

          public Node() {
               children = new ArrayList<>();
          }

          public Node(int _val) {
               val = _val;
               children = new ArrayList<>();
          }

          public Node(int _val, List<Node> _children) {
               val = _val;
               children = _children;
          }
     }

     public static List<List<Integer>> levelOrder(Node root) {
          List<List<Integer>> result = new ArrayList<>();

          if (root == null) {
               return result;
          }

          Queue<Node> q = new LinkedList<>();
          q.add(root);

          while (!q.isEmpty()) {
               int size = q.size();
               List<Integer> level = new ArrayList<>();

               for (int i = 0; i < size; i++) {
                    Node curr = q.remove();
                    level.add(curr.val);

                    for (Node child : curr.children) {
                         q.add(child);
                    }
               }
               result.add(level);
          }
          return result;
     }

     public static void main(String[] args) {
          Node node5 = new Node(5);
          Node node6 = new Node(6);
          Node node3 = new Node(3, Arrays.asList(node5, node6));
          Node node2 = new Node(2);
          Node node4 = new Node(4);
          Node root = new Node(1, Arrays.asList(node3, node2, node4));

          List<List<Integer>> levels = levelOrder(root);

          for (List<Integer> level : levels) {
               System.out.println(level);
          }
     }
}
