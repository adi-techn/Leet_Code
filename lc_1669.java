     public class lc_1669 {
          public class ListNode{
               int data;
               ListNode next;
     
               public ListNode(int data){
               this.data=data;
               this.next=null;
               }
          }
          public ListNode head;
          public void addFirst(int data){
               ListNode newNode=new ListNode(data);
               newNode.next=head;
               head=newNode;
          }
          public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2){
               ListNode head=list1;
               ListNode temp=list1,prev=null,next=list1;
               while (b >= 0) {
               next = next.next;
               b--;
               }
               while (a > 0) {
               prev = temp;
               temp = temp.next;
               a--;
               }
               prev.next = list2;
               temp = list2;
               while (temp.next != null) {
               temp = temp.next;
               }
               temp.next = next;
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
               lc_1669 ll=new lc_1669();
               ll.addFirst(5);
               ll.addFirst(4);
               ll.addFirst(3);
               ll.addFirst(2);
               ll.addFirst(1);

               lc_1669 ll1=new lc_1669();
               ll1.addFirst(10);
               ll1.addFirst(11);
               ll1.addFirst(12);

               ll.printLL();
               ll1.printLL();
               ll.head=mergeInBetween(ll.head,1,3,ll1.head);
               ll.printLL();
          }
     }
