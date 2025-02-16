public class lc_2 {
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
     public static ListNode addTwoNumbers(ListNode list1, ListNode list2) {
          int carry=0;
          ListNode aux= new ListNode(0);
          ListNode curr=aux;

          while (list1 != null || list2 != null || carry!=0) {
              int sum = carry;
              if (list1 != null) {
                  sum += list1.val;
                  list1 = list1.next;
              }
              if (list2 != null) {
                  sum += list2.val;
                  list2 = list2.next;
              }
              carry = sum / 10;
              ListNode newNode = new ListNode(sum % 10);
              curr.next = newNode;
              curr=newNode;
          }
  
          return aux.next;
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
          lc_2 ll=new lc_2();
          ll.addFirst(0);
          ll.addFirst(9);
          ll.addFirst(9);
          ll.addFirst(9);
          ll.addFirst(9);

          lc_2 ll1=new lc_2();
          ll1.addFirst(9);
          ll1.addFirst(9);
          ll1.addFirst(9);

          ll.printLL();
          ll1.printLL();

          lc_2 result = new lc_2();
          result.head = addTwoNumbers(ll.head, ll1.head);
          result.printLL();
     }
}
