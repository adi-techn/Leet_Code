public class lc_2326 {
     public static class ListNode{
          int val;
          ListNode next;

          public ListNode(int data){
               this.val=data;
               this.next=null;
          }
     }
     public static ListNode head;
     public void addFirst(int data){
          ListNode newNode=new ListNode(data);
          newNode.next=head;
          head=newNode;
     }
     public static int[][] spiralMatrix(int m, int n, ListNode head) {
          int arr[][]=new int[m][n];
          int strow=0;
          int stcol=0;
          int endrow=m;
          int endcol=n;
          for(int i=0;i<m;i++){
              for(int j=0;j<n;j++){
                  arr[i][j]=-1;
              }
          }
  
          while(strow<=endrow && stcol<=endcol){
              //top boundary
              for(int j=stcol;j<endcol;j++){
                  if(head!=null){
                      arr[strow][j]=head.val;
                      head=head.next;
                  }
              }
              //right
              for(int i=strow+1;i<endrow;i++){
                  if(head!=null){
                      arr[i][endcol-1]=head.val;
                      head=head.next;
                  }
              }
              //bottom
              for(int j=endcol-2;j>=stcol;j--){
                  if(strow==endrow){
                      break;
                  }
                  if(head!=null){
                      arr[endrow-1][j]=head.val;
                      head=head.next;
                  }
              }
              //left
              for(int i=endrow-2;i>=strow+1;i--){
                  if(stcol==endcol){
                      break;
                  }
                  if(head!=null){
                      arr[i][stcol]=head.val;
                      head=head.next;
                  }
              }
              strow++;stcol++;endcol--;endrow--;
          }
          return arr;
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
          lc_2326 ll=new lc_2326();
          ll.addFirst(3);
          ll.addFirst(0);
          ll.addFirst(2);
          ll.addFirst(6);
          ll.addFirst(8);
          ll.addFirst(1);
          ll.addFirst(7);
          ll.addFirst(9);
          ll.addFirst(4);
          ll.addFirst(2);
          ll.addFirst(5);
          ll.addFirst(5);
          ll.addFirst(0);  

          ll.printLL();
          int arr[][]=spiralMatrix(3,5,head);
          for(int i=0;i<arr.length;i++){
               for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
               }
               System.out.println();
          }
     }
}
