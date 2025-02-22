import java.util.ArrayList;
import java.util.Stack;

public class lc_1019{
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
    public static int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        Stack<Integer> s=new Stack<>();
        int nextG[]=new int[arr.size()];
        for(int i=arr.size()-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr.get(i)){
                s.pop();
            }
            if(s.isEmpty()){
                nextG[i]=0;
            }
            else{
                nextG[i]=s.peek();
            }
            s.push(arr.get(i));
        }
        return nextG;
    }
    public static void main(String[] args) {
        lc_1019 ll=new lc_1019();
        ll.addFirst(5);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(7);
        ll.addFirst(2);
        int arr[]=nextLargerNodes(ll.head);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
