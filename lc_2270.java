public class lc_2270{
     public static int waysToSplit(int arr[]){
          long totalSum=0,leftSum=0;             //Long datatype used for larger input
          int c=0;
          for(int i=0;i<arr.length;i++){
               totalSum+=arr[i];
          }
          for(int i=0;i<arr.length-1;i++){
               totalSum-=arr[i];
               leftSum+=arr[i];
               if(leftSum>=totalSum){ 
                    c++;
               }
          }
          return c;
     }
     public static void main(String[] args) {
          int arr[]={10,4,-8,7};
          System.out.println(waysToSplit(arr));
     }
}