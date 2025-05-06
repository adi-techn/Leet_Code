public class lc_162 {
     public static int findPeakElement(int[] nums) {
          int si=0,ei=nums.length-1;
          while(si<ei){
               int mid=(si+ei)/2;
               if(nums[mid] < nums[mid+1]){
                  si=mid+1;
               }
               else{
                  ei=mid;
               }
          }
          return si;
     }
     public static void main(String[] args) {
          int arr[]={1,2,3,1};
          System.out.println(findPeakElement(arr));
     }
}
