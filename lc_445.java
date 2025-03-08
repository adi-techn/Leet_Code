import java.util.Stack;

public class lc_445{
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
     public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          l1=reverse(l1);
          l2=reverse(l2);
          Stack<Integer> s=new Stack<>();
          int carry=0;
          ListNode temp1=l1,temp2=l2;
          while((temp1!=null)&&(temp2!=null)){
              int sum=temp1.val+temp2.val+carry;
              carry=sum/10;
              s.push(sum%10);
              temp1=temp1.next;
              temp2=temp2.next;
          }
          while(temp1!=null){
              int sum=temp1.val+carry;
              carry=sum/10;
              s.push(sum%10);
              temp1=temp1.next;
          }
          while(temp2!=null){
              int sum=temp2.val+carry;
              carry=sum/10;
              s.push(sum%10);
              temp2=temp2.next;
          }
          while(carry!=0){
              s.push(carry%10);
              carry/=10;
          }
          ListNode aux=new ListNode(0);
          ListNode curr=aux;
          while(!s.isEmpty()){
              ListNode newNode=new ListNode(s.pop());
              curr.next=newNode;
              curr=newNode;
          }
          curr.next=null;
          return aux.next;
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
          lc_445 ll=new lc_445();
          ll.addFirst(3);
          ll.addFirst(4);
          ll.addFirst(2);
          ll.addFirst(7);

          lc_445 ll1=new lc_445();
          ll1.addFirst(4);
          ll1.addFirst(6);
          ll1.addFirst(5);

          ll.printLL();
          ll1.printLL();

          lc_445 result = new lc_445();
          result.head = addTwoNumbers(ll.head, ll1.head);
          result.printLL();
     }
}