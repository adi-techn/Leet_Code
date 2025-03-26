public class lc_2149{
     public static int[] rearrangeArray(int[] nums) {
          int pos[]=new int[nums.length/2];
          int neg[]=new int[nums.length/2];
          int m=0,n=0;
          for(int i=0;i<nums.length;i++){
               if(nums[i]>=0){
                    pos[m++]=nums[i];
               }else{
                    neg[n++]=nums[i];
               }
          }
          int c=0;
          m=0;n=0;
          for(int i=0;i<nums.length;i++){
               if(c%2==0){
                    nums[i]=pos[m++];
               }else{
                    nums[i]=neg[n++];
               }
               c++;
          }
          for(int i=0;i<nums.length;i++){
               System.out.print(nums[i]+" ");
          }
          return nums;
     }
     public static void main(String[] args) {
          int arr[]={-1,1};
          rearrangeArray(arr);
     }
}