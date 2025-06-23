public class lc_238 {
     public static int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];

        int suf=1;
        int pre=1;

        for(int i=0;i<nums.length;i++){
            ans[i]=1;
        }

        for(int i=0;i<nums.length;i++){
            ans[i]*=pre;
            pre*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=suf;
            suf*=nums[i];
        }
        return ans;
     }
     public static void main(String[] args) {
          int arr[]={1,2,3,4};
          for(int x:productExceptSelf(arr)){
               System.out.print(x+" ");
          }
     }
}
