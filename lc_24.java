public class lc_24{
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
     public Node swapNode(Node head) {
          if(head==null || head.next==null){
               return head;
          }
          Node f=head;
          Node s=head.next;
          f.next=swapNode(s.next);
          s.next=f;

          return s;
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
          lc_24 ll=new lc_24();
          ll.add(5);
          ll.add(4);
          ll.add(3);
          ll.add(2);
          ll.add(1);

          ll.printLL();
          ll.swapNode(head);
          ll.printLL();
     }
}


