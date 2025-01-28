public class lc_3432{
     public static int partitionCount(int arr[]){
         int ts=0,c=0,fs=0;
         for(int i=0;i<arr.length;i++){
             ts+=arr[i];
         }
         for(int i=0;i<arr.length-1;i++){
             ts-=arr[i];
             fs+=arr[i];
             if((fs-ts)%2==0){
                 c++;
             }
         }
         return c;
     }
     public static void main(String[] args) {
         int arr[]={1,2,2};
         System.out.println(partitionCount(arr));
     }
 }
 