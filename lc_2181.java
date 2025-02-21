public class lc_2181{
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
     public static ListNode mergeNodes(ListNode head) {
          ListNode aux=new ListNode(0);
          ListNode curr=aux;
          int sum=0;
          while(head!=null&&head.next!=null){
              head=head.next;
              if(head.val==0){
                  ListNode newNode=new ListNode(sum);
                  curr.next=newNode;
                  curr=curr.next;
                  sum=0;
              }
              sum+=head.val;
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
          lc_2181 ll=new lc_2181();
          ll.addFirst(0);
          ll.addFirst(3);
          ll.addFirst(1);
          ll.addFirst(0);
          ll.addFirst(4);
          ll.addFirst(5);
          ll.addFirst(2);
          ll.addFirst(0);

          ll.printLL();
          lc_2181 result = new lc_2181();
          result.head = mergeNodes(ll.head);
          result.printLL();
     }
}
