import java.util.ArrayList;

class lc_1721{
     public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
            this.next=null;
        }
     }
     public static Node head;
     public static Node tail;
     public void add(int data){
          Node newNode=new Node(data);
          if(head==null){
              head=tail=newNode;
          }
          else{
               newNode.next=head;
               head=newNode;
          }
      }
     public Node swapNodes(Node head, int k) {
          Node f=head;
          ArrayList<Node> arr=new ArrayList<>();
          while(f!=null){
               arr.add(f);
               f=f.next;
          }
          int size=arr.size();
          int temp=arr.get(k-1).val;
          arr.get(k-1).val=arr.get(size-k).val;
          arr.get(size-k).val=temp;

          return head;
     }
     public void printLL(){
          Node temp=head;
          while(temp!=null){
              System.out.print(temp.val+"->");
              temp=temp.next;
          }
          System.out.print("null");
          System.out.println();
     }
     public static void main(String[] args) {
          lc_1721 ll=new lc_1721();
          ll.add(1);
          ll.add(2);
          ll.add(3);
          ll.add(4);
          ll.add(5);

          ll.printLL();
          ll.swapNodes(head, 2);
          ll.printLL();
     }
}



