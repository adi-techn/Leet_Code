import java.util.Stack;

public class lc_2130{
     public static class ListNode{
          int val;
          ListNode next;

          public ListNode(int data){
               this.val=data;
               this.next=null;
          }
     }
     public static ListNode head;
     public static void addFirst(int data){
          ListNode newNode=new ListNode(data);
          newNode.next=head;
          head=newNode;
     }
     public static int pairSum(ListNode head) {
          Stack<Integer> s=new Stack<>();
          int i=0,n=0;
          ListNode temp=head;
          while(temp!=null){
              n++;
              s.push(temp.val);
              temp=temp.next;
          }
          temp=head;
          int max=Integer.MIN_VALUE;
          while(i<(n/2)){
              int sum=s.pop()+temp.val;
              if(max<sum){
                  max=sum;
              }
              temp=temp.next;
              i++;
          }
          return max;
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
          lc_2130 ll=new lc_2130();
          ll.addFirst(5);
          ll.addFirst(4);
          ll.addFirst(2);
          ll.addFirst(1);

          System.out.println(ll.pairSum(head));
     }
}
