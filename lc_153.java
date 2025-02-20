public class lc_153{
     public static  int findMin(int[] nums) {
          int si=0,ei=nums.length-1;
          int t=Integer.MAX_VALUE;
          while(si<=ei){
              int mid=si+(ei-si)/2;
               if(nums[mid]<=t)
                  t=Math.min(t,nums[mid]);
               if(nums[si]<=nums[mid]){
                  t=Math.min(t,nums[si]);
                  si=mid+1;
               }
               else{
                  t=Math.min(t,nums[mid]);
                  ei=mid-1;
               }
          }
          return t;
     }
     public static void main(String[] args) {
          int arr[]={5,1,2,3,4};
          System.out.println(findMin(arr));
     }
}
