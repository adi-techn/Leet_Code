import java.util.Stack;

public class lc_2487 {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int data) {
            this.val = data;
            this.next = null;
        }
    }

    public static ListNode head;

    public void addFirst(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void printLL(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static ListNode removeNodes(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode temp= head;

        while(temp!=null){
            s.push(temp.val);
            temp=temp.next;
            while(!s.isEmpty()&& temp!=null && temp.val>s.peek()){
                s.pop();
            }
        }
        ListNode newHead = null;
        while (!s.isEmpty()){
            ListNode node =new ListNode(s.pop());
            node.next = newHead;
            newHead = node;
        }
        // newHead=reverse(newHead);
        return newHead;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        lc_2487 ll = new lc_2487();
        ll.addFirst(8);
        ll.addFirst(3);
        ll.addFirst(13);
        ll.addFirst(2);
        ll.addFirst(5);
        ll.printLL(head);
        head = removeNodes(head);
        ll.printLL(head);
    }
}
