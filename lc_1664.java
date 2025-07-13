public class lc_1664 {
     public static int waysToMakeFair(int[] nums) {
        int odd_sum=0;
        int even_sum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even_sum+=nums[i];
            }else{
                odd_sum+=nums[i];
            }
        }
        int cnt=0;
        int prev=0;
        for(int i=0;i<nums.length;i++){
            int newOdd=even_sum-nums[i]+prev;
            int newEven=odd_sum;
            prev=nums[i];
            if(newEven==newOdd){
                cnt++;
            }
            even_sum=odd_sum;
            odd_sum=newOdd;
        }
        return cnt;
     }
     public static void main(String[] args) {
          int nums[]={2,1,6,4};
          System.out.println(waysToMakeFair(nums));
     }
}
