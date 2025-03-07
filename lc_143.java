import java.util.Stack;

public class lc_143{
     public static class ListNode{
          int val;
          ListNode next;

          public ListNode(int data){
               this.val=data;
               this.next=null;
          }
     }
     public static ListNode head;
     public void addFirst(int data){
          ListNode newNode=new ListNode(data);
          newNode.next=head;
          head=newNode;
     }
     public void reorderList(ListNode head) {
          Stack<ListNode> s=new Stack<>();
          ListNode temp1=head;
          while(temp1!=null){
              s.push(temp1);
              temp1=temp1.next;
          }
          ListNode temp=head;
          ListNode prev=null;
          int c=0,i=0,mid=s.size()/2;
          while(i<mid){
               if(c%2!=0 && i<mid){
                  prev=temp.next;
                  temp.next=s.pop();
                  temp=temp.next;
                  temp.next=prev;
                  temp=temp.next;
                  i++;
               }
               c++;
          }
          temp.next=null;
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
          lc_143 ll=new lc_143();
          // ll.addFirst(5);
          ll.addFirst(4);
          ll.addFirst(3);
          ll.addFirst(2);
          ll.addFirst(1);

          ll.reorderList(head);
          ll.printLL();
     }
}

