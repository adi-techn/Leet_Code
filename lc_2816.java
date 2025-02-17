public class lc_2816{
     public static class ListNode{
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
     public static ListNode doubleIt(ListNode head) {
          if(head.val==0){
              return head;
          }
          head=reverse(head);
          ListNode aux=new ListNode(-1);
          ListNode curr=aux;
          ListNode temp = head;
          int carry = 0;
          while (temp != null || carry > 0) {
              int sum = carry;
              if (temp != null) {
                  sum += temp.val * 2;
                  temp = temp.next;
              }
              carry = sum / 10;
              ListNode newNode = new ListNode(sum % 10);
              curr.next = newNode;
              curr = curr.next;
          }
          return reverse(aux.next);
     }
     public static ListNode reverse(ListNode head){                     //L.C. 212
          ListNode prev=null;
          ListNode curr=head;
          ListNode next;
  
          while(curr!=null){
              next=curr.next;
              curr.next=prev;
              prev=curr;
              curr=next;
          }
          head=prev;
          return head;
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
          lc_2816 ll=new lc_2816();
          ll.addFirst(3);
          ll.addFirst(1);
          ll.addFirst(0);
          ll.addFirst(4);
          ll.addFirst(5);
          ll.addFirst(2);

          ll.printLL();
          lc_2816 result = new lc_2816();
          result.head = doubleIt(ll.head);
          result.printLL();
     }
}
