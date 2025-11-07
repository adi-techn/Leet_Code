import java.util.ArrayList;
import java.util.List;

public class lc_658 {
     public static List<Integer> findClosestElements(int[] arr, int k, int x) {
          ArrayList<Integer> ans = new ArrayList<>();

          int si = 0, ei = arr.length - k;

          // while(k>0){
          // int ax=Math.abs(arr[si]-x);
          // int bx=Math.abs(arr[ei]-x);

          // if((ax<bx) || (ax==bx && arr[si]<arr[ei])){
          // ans.add(arr[si++]);
          // }else{
          // ans.add(arr[ei--]);
          // }
          // k--;
          // }
          // Collections.sort(ans);

          while (si < ei) {
               int mid = (si + ei) / 2;
               if (x - arr[mid] > arr[mid + k] - x) {
                    si = mid + 1;
               } else {
                    ei = mid;
               }
          }

          for (int i = si; i < si + k; i++) {
               ans.add(arr[i]);
          }

          return ans;
     }

     public static void main(String[] args) {
          int nums[]={1,2,3,4,5};
          int k=4,x=3;

          System.out.println(findClosestElements(nums, k, x));
     }
}
