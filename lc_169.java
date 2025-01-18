
public class lc_169{
     public static int majorityElem(int arr[]){
         int n=arr.length;
         int k=0;
         for(int i=0;i<arr.length;i++){
             int c=0;
             for(int j=i+1;j<arr.length;j++){
                 if(arr[i]==arr[j]){
                     c++;
                 }
             }
             if(c==(n/2)){
                 k=arr[i];
             }
         }
         return k;
     }
     public static void main(String[] args) {
         int arr[]={2,2,1,1,1,2,2};
         System.out.println(majorityElem(arr));
     }
 }
 
 
 