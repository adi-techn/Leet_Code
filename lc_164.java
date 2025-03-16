import java.util.*;
public class lc_164 {
     public static int maxGap(int nums[]){
          if(nums.length<2){
               return 0;
          }
          Arrays.sort(nums);
          int max=Integer.MIN_VALUE;
          for(int i=0;i<nums.length-1;i++){
               if(max<nums[i+1]-nums[i]){
                    max=nums[i+1]-nums[i];
               }
          }
          return max;
     }
     public static void main(String[] args) {
          int arr[]={5,2,6,8};
          System.out.println(maxGap(arr));
     }
}
