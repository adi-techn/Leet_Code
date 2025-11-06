public class lc_167 {
     public static int[] twoSum(int nums[],int target){
          int si=0,ei=nums.length-1,sum=0;
          int ans[]={1,1};

          while(si<ei){
               sum=nums[si]+nums[ei];
               if(sum==target){
                    ans[0]+=si;
                    ans[1]+=ei;
                    break;
               }else if(sum<target){
                    si++;
               }else{
                    ei--;
               }
          }
          return ans;
     }
     public static void main(String[] args) {
          int nums[]={2,7,11,15};
          int target=9;

          for(int x:twoSum(nums, target)){
               System.out.print(x+" ");
          }
     }
}
