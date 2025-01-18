public class lc_69{
     public static int sqrt(int x){
         if(x==0 || x==1){
             return x;
         }
         int si=1,ei=x,mid=-1;
         while (si<=ei) {
             mid=si+(ei-si)/2;
             if((long)mid*(long)mid>x){
                 ei=mid-1;
             }
             else if(mid*mid==x){
                 return mid;
             }
             else{
                 si=mid+1;
             }
         }
         return Math.round(ei);
     }
     public static void main(String[] args) {
         System.out.println(sqrt(8));
     }
 }