public class lc_367{
     public static boolean isPerfectSquare(int n){
         if(n==1){
             return true;
         }
         for(int i=1;i<=n/2;i++){
             if(i*i==n){
                 return true;
             }
             if(i*i>n){
                 break;
             }
         }
         return false;
     }
     public static void main(String[] args) {
         System.out.println(isPerfectSquare(100000001));
     }
 }