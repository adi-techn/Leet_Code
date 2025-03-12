import java.util.Stack;

public class lc_962{
     public static int maxWidthRamp(int[] arr) {
        Stack<Integer> s=new Stack<>();
        for (int i=0; i<arr.length;i++) {
            if (s.isEmpty() || arr[i] < arr[s.peek()]) {
                s.push(i);
            }
        }
        int max= 0;
        for (int j=arr.length-1;j>max;j--) {
            while (!s.isEmpty() && arr[j]>=arr[s.peek()]) {
                max= Math.max(max, j-s.pop());
            }
        }
        return max;
     }
     public static void main(String[] args) {
          int arr[]={6,0,8,2,1,5};
          System.out.println(maxWidthRamp(arr));
     }
}