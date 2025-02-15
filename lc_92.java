public class lc_92{
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
     public static ListNode reverseBetween(ListNode head, int left, int right) {
          //Base Case
          if(head.next==null){
              return head;
          }
          ListNode temp=head;
          ListNode leftLast=null,rightFirst=null;
          ListNode revHead=null,revTail=null;
          //Finding head of sub-list to reverse
          for(int i=1;i<left;i++){
              leftLast=temp;
              temp=temp.next;
          }
          revTail=temp;
          //Finding end cond. upto which sub-list need to be reversed
          for(int i=0;i<(right-left);i++){
              temp=temp.next;
          }
          revHead=temp;
          rightFirst=temp.next;
          //Reversing the sub-list
          ListNode curr=revTail,prev=null,next=null;
          while(curr != rightFirst){
              next=curr.next;
              curr.next=prev;
              prev=curr;
              curr=next;
          }
          //Assigning the head of the final list
          if (leftLast != null) {
              leftLast.next = revHead;
          } 
          else{
              head = revHead;
          }
          revTail.next=rightFirst;
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
          lc_92 ll=new lc_92();
          ll.addFirst(5);
          ll.addFirst(4);
          ll.addFirst(3);
          ll.addFirst(2);
          ll.addFirst(1);

          ll.printLL();
          ll.head=reverseBetween(ll.head, 2, 4);
          ll.printLL();
     }
}
