public class lc_83{
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
     public static ListNode deleteDuplicates(ListNode head) {
          if(head==null||head.next==null){
              return head;
          }
          ListNode temp=head;
          ListNode prev=null;
          while(temp!=null&&temp.next!=null){
              prev=temp;
              temp=temp.next;
              while(temp!=null&&prev.val==temp.val){
                  temp=temp.next;
                  prev.next=temp;
              }
          }
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
          lc_83 ll=new lc_83();
          ll.addFirst(4);
          ll.addFirst(3);
          ll.addFirst(2);
          ll.addFirst(1);
          ll.addFirst(1);

          ll.printLL();
          ll.head=deleteDuplicates(ll.head);
          ll.printLL();
     }
}
