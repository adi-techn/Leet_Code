public class lc_2903{
     public static int[] findIndices(int[] arr, int id, int vd) {
          int nums[]={-1,-1};
          for(int i=0;i<arr.length;i++){
              for(int j=0;j<arr.length;j++)
              if(Math.abs(i-j)>=id && Math.abs(arr[i]-arr[j])>=vd){
                  nums[0]=i;
                  nums[1]=j;
                  printArr(nums);
                  return nums;
              }
          }
          printArr(nums);
          return nums;
     }
     public static void printArr(int nums[]){
          for(int i=0;i<nums.length;i++){
               System.out.print(nums[i]+" ");
          }
     }
     public static void main(String[] args) {
          int arr[]={5,1,2,1};
          findIndices(arr,2,4);
     }
}

