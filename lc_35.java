public class lc_35{
     public static int search(int[] nums, int target) {
         int si=0,ei=nums.length-1,mid=-1;
         while(si<=ei){
             mid=si+(ei-si)/2;
             if(nums[mid]==target){
                 return mid;
             }
             else if(nums[mid]<target){
                 si=mid+1;
             }
             else{
                 ei=mid-1;
             }
         }
         if(nums[mid]>target){
             return mid;
         }
         return mid+1;
     }
     public static void main(String[] args) {
         int arr[]={1,3,5,6};
         System.out.println(search(arr,2));
     }
 }