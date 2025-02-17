public class lc_2807{
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
     public static ListNode insertGcd(ListNode head) {
          ListNode temp=head;
          while(temp!=null&&temp.next!=null){
              int gcd=gcd(temp.val,temp.next.val);
              ListNode newNode=new ListNode(gcd);
              ListNode next=temp.next;
              temp.next=newNode;
              newNode.next=next;
              temp=next;
          }
          return head;
     }
     public static int gcd(int n1,int n2){
          if(n2 != 0)
              return gcd(n2, n1 % n2);
          else
              return n1;
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
          lc_2807 ll=new lc_2807();
          ll.addFirst(3);
          ll.addFirst(10);
          ll.addFirst(6);
          ll.addFirst(18);

          ll.printLL();
          lc_2807 result = new lc_2807();
          result.head = insertGcd(ll.head);
          result.printLL();
     }
}
