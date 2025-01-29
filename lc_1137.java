public class lc_1137{
     public static int tri(int n){
         int n0=0,n1=1,n2=1,n3=0;
         if(n==0){
             return n0;
         }
         else if(n==1||n==2){
             return 1;
         }
         for(int i=3;i<=n;i++){
             n3=n0+n1+n2;
             n0=n1;
             n1=n2;
             n2=n3;
         }
         return n3;
     }
     public static void main(String[] args) {
         System.out.println(tri(4));
     }
 }