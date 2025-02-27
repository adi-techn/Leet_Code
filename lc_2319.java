
public class lc_2319{
     public static boolean Xmatrix(int arr[][]){
         int n=arr.length;
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 if(i==j || i+j==n-1){
                     if(arr[i][j]==0)
                         return false;
                         
                 }
                 else{
                     if(arr[i][j]!=0){
                         return false;
                     }
                         
                 }
             }
         }
         return true;
     }
     public static void main(String[] args) {
         int arr[][]={{2,0,0,1},{0,3,2,0},{0,5,2,0},{4,0,0,2}};
         System.out.println(Xmatrix(arr));
     }
 }
 
 
 