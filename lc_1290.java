public class lc_1290{
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
     public static int getDecimalValue(ListNode head) {
          int size=0;
          ListNode temp=head;
          while(temp!=null){
              size++;
              temp=temp.next;
          }
          int sum=0;
          while(head!=null){
              sum+=Math.pow(2,--size)*head.val;
              head=head.next;
          }
          return sum;
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
          lc_1290 ll=new lc_1290();
          ll.addFirst(1);
          ll.addFirst(0);
          ll.addFirst(1);

          ll.printLL();
          System.out.println("Integer value:: "+getDecimalValue(ll.head));
     }
}
