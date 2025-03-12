public class lc_742{
     public static int pivotIndex(int arr[]){
          int totalSum=0,leftSum=0;
          for(int i=0;i<arr.length;i++){
               totalSum+=arr[i];
          }
          for(int i=0;i<arr.length;i++){
               totalSum-=arr[i];
               if(totalSum==leftSum){
                    return i;
               }
               leftSum+=arr[i];
          }
          return -1;
     }
     public static void main(String[] args) {
          int arr[]={1,2,3};
          System.out.println(pivotIndex(arr));
     }
}
