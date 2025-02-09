public class lc_61{
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
     public Node rotateRight(Node head, int k) {
          if(head==null||head.next==null||k==0){
               return head;
          }
          Node temp=head;
          int size=1;
          while(temp.next!=null){
               temp=temp.next;
               size++;
          }
          temp.next=head;
          k=k%size;
          int changeHead=size-k;
          temp=head;
          for(int i=1;i<changeHead;i++){
               temp=temp.next;
          }
          head=temp.next;
          temp.next=null;
          return head;
     }
     public void printLL(){
          Node curr=head;
          while(curr!=null){
              System.out.print(curr.val+"->");
              curr=curr.next;
          }
          System.out.print("null");
          System.out.println();
     }
     public static void main(String[] args) {
          lc_61 ll=new lc_61();
          ll.add(5);
          ll.add(4);
          ll.add(3);
          ll.add(2);
          ll.add(1);

          ll.printLL();
          ll.rotateRight(head, 2);
     }
}


