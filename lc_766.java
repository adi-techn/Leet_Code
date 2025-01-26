
public class lc_766{
     public static boolean toeplitz(int arr[][]){
         int n=arr.length;
         int m=arr[0].length;
         int c=0;
         for(int i=0;i<n-1;i++){
             for(int j=0;j<m-1;j++){
                 if(arr[i][j]==arr[i+1][j+1])
                     c++;
             }
         }
         if(c==(n-1)*(m-1)){
             return true;
         }
         return false;
     }
     public static void main(String[] args) {
         int arr[][]={{1,2},{2,2}};
         System.out.println(toeplitz(arr));
     }
 }
 
 
 