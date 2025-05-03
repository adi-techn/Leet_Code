public class lc_3427 {
     public static int subarraySum(int[] nums) {
         int sum=0;
         for(int i=0;i<nums.length;i++){
             for(int j=Math.max(0,i-nums[i]);j<=i;j++){
                 sum+=nums[j];
             }
         }
         return sum;
     }
     public static void main(String[] args) {
         int mat[]={2,3,1};
         System.out.println(subarraySum(mat));
     }
}
 