public class lc_485 {
     public static int findMaxConsecutiveOnes(int[] nums) {
          int c=0,max=Integer.MIN_VALUE;
          for(int i=0;i<nums.length;i++){
              if(nums[i]==0){
                  c=0;
              }
              else{
                  c++;
              }
              if(max<c){
                      max=c;
               }
          }
          return max;
     }
     public static void main(String[] args) {
          int arr[]={1,1,0,1,1,1};
          System.out.println(findMaxConsecutiveOnes(arr));
     }
}
