import java.util.LinkedList;
public class lc_2095 {
     public class ListNode{
          int data;
          ListNode next;
  
          public ListNode(int data){
              this.data=data;
              this.next=null;
          }
     }
     public static ListNode head;
     public void addFirst(int data){
          ListNode newNode=new ListNode(data);
          newNode.next=head;
          head=newNode;
      }
     public static ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            return null;
        }
        ListNode slow=head,fast=head,prev=null,next=null;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            next=slow.next;
            fast=fast.next.next;
        }
        prev.next=next;
        return head;
     }
     public void printLL(){
          ListNode temp=head;
          while(temp!=null){
              System.out.print(temp.data+"->");
              temp=temp.next;
          }
          System.out.print("null");
          System.out.println();
      }
     public static void main(String[] args) {
          lc_2095 ll=new lc_2095();
          // ll.addFirst(5);
          ll.addFirst(4);
          ll.addFirst(3);
          ll.addFirst(2);
          ll.addFirst(1);

          ll.printLL();
          deleteMiddle(head);
          ll.printLL();
     }
}
