import java.util.Arrays;

public class lc_414{
     public static int thirdMax(int nums[]){
          Arrays.sort(nums);
          int n=nums.length,c=1;
          for (int i = n - 1; i >= 1; i--) {
               if (nums[i] != nums[i - 1]) 
                   c++;
               if (c==3)
                   return nums[i - 1];
          }
   
          return nums[n - 1];
     }
     public static void main(String[] args) {
          int arr[]={1,1,1};
          System.out.println(thirdMax(arr));
     }
}
