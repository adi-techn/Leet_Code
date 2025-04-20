import java.util.*;

public class lc_1508 {
     static int mod=1000000007;
     public static int rangeSum(int[] nums, int n, int left, int right) {
          ArrayList<Integer> arr=new ArrayList<>();
          for(int i=0;i<nums.length;i++){
               int sum=0;
               for(int j=i;j<nums.length;j++){
                    sum=(sum+nums[j])%mod;
                    arr.add(sum);
               }
          }
          Collections.sort(arr);
          int sum=0;
          for(int i=left-1;i<right;i++){
               sum=(sum+arr.get(i))%mod;
          }
          return sum%mod;
     }
     public static void main(String[] args) {
          int arr[]={1,2,3,4};
          System.out.println(rangeSum(arr,4,1,5));
     }
}
