import java.util.Stack;

public class lc_496 {
     public static int[] nextGreaterElement(int[] nums1, int[] arr) {
          Stack<Integer> s=new Stack<>();
          int nextG[]=new int[arr.length];
          for(int i=arr.length-1;i>=0;i--){
               //Step-1
               while(!s.isEmpty() && s.peek()<=arr[i]){
                    s.pop();
               }
               //Step-2
               if(s.isEmpty()){
                    nextG[i]=-1;
               }
               else{
                    nextG[i]=s.peek();
               }
               //Step-3
               s.push(arr[i]);
          }
          int[] result = new int[nums1.length];
          for (int i = 0; i < nums1.length; i++) {
               for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == nums1[i]) {
                         result[i] = nextG[j];
                         break;
                    }
               }
          }
          return result;
     }
     public static void main(String[] args) {
          int num[]={4,1,2};
          int arr[]={1,3,4,2};
          nextGreaterElement(num,arr);
     }
}
