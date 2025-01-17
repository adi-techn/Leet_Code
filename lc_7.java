
public class lc_7{
     public static int revInt(int n){
         int num=0,r,m;
         m=n;
         while(n!=0){
             r=n%10;
             if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && r > 7)) {
                 return 0; 
             }
             if (num < Integer.MIN_VALUE / 10 || (num == Integer.MIN_VALUE / 10 && r < -8)) {
                 return 0; 
             }
             num=(num*10)+r;
             n/=10;
         }
         if(m<0){
             num=-Math.abs(num);
         }
         if(num%10==0){
             num/=10;
         }
         
         return num;
 
     }
     public static void main(String[] args) {
        System.out.println(revInt(1534236469));
     }
 }
 
 
 