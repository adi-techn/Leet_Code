public class lc_665{
     public static boolean checkPossibility(int[] nums) {
          int c=0;
          for(int i=0;i<nums.length-1;i++){
              if(!(nums[i]<=nums[i+1])){
                  c++;
                  if(c>1){
                      return false;
                  }
                  if(i==0 || nums[i-1]<=nums[i+1]){
                      nums[i]=nums[i+1];
                  }else{
                      nums[i+1]=nums[i];
                  }
              }
          }
          return true;
     }
     public static void main(String[] args) {
          int arr[]={3,4,2,3};
          System.out.println(checkPossibility(arr));
     }
}