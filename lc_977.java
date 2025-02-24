import java.util.Arrays;
public class lc_977{
     public static void sortedSquare(int arr[]){
          for(int i=0;i<arr.length;i++){
               arr[i]=(arr[i]*arr[i]);
          }
          Arrays.sort(arr);
     }
     public static void main(String[] args) {
          int arr[]={-4,-1,0,3,10};
          sortedSquare(arr);
          for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+" ");
          }
     }
}
