public class lc_2653 {
     public static int[] getSubarrayBeauty(int nums[],int k,int x){
          int counter[]=new int[50];
          int res[]=new int[nums.length-k+1];

          for(int i=0;i<nums.length;i++){
               if(nums[i]<0){
                    counter[nums[i]+50]++;
               }
               if(i-k>=0 && nums[i-k]<0){
                    counter[nums[i-k]+50]--;
               }
               if(i-k+1<0){
                    continue;
               }
               for(int j=0,count=0;j<50;j++){
                    count+=counter[j];
                    if(count>=x){
                         res[i-k+1]=j-50;
                         break;
                    }
               }
          }
          return res;
     }
     public static void main(String[] args) {
          int arr[]={1,-1,-3,-2,3};
          int k=3;
          int x=2;

          for(int num:getSubarrayBeauty(arr, k, x)){
               System.out.print(num+" ");
          }
     }
}
