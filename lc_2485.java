public class lc_2485{
     public static int pivotInteger(int n){
         if(n==1){
             return n;
         }
         int sum=1;
         for(int i=1;i<n;i++){
             sum+=(i+1);
             int s=0;
             for(int j=i+1;j<=n;j++){
                 s+=j;
             }
             if(sum==s){
                 return i+1;
             }
         }
         return -1;
     }
     public static void main(String[] args) {
         System.out.println(pivotInteger(0));
     }
 }