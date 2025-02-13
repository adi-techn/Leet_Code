public class lc_237 {
     public class ListNode{
          int val;
          ListNode next;

          public ListNode(int data){
               this.val=data;
               this.next=null;
          }
     }
     public ListNode head;
     public void addFirst(int data){
          ListNode newNode=new ListNode(data);
          newNode.next=head;
          head=newNode;
     }
     public static void deleteNode(ListNode node) {
          ListNode temp=node,prev=null;
          while(temp!=null && temp.next!=null){
              prev=node;
              node.val=node.next.val;
              temp=temp.next;
              node=node.next;
          }
          prev.next=null;
     }
     public void printLL(){
          ListNode temp=head;
          while(temp!=null){
          System.out.print(temp.val+"->");
          temp=temp.next;
          }
          System.out.print("null");
          System.out.println();
     }
     public static void main(String[] args) {
          lc_237 ll=new lc_237();
          ll.addFirst(5);
          ll.addFirst(4);
          ll.addFirst(3);
          ll.addFirst(2);
          ll.addFirst(1);

          ListNode node=ll.head.next.next;
          ll.printLL();
          ll.deleteNode(node);
          ll.printLL();
     }
}
