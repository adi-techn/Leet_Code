public class lc_50{
     public static double myPow(double x, int n) {
         int m=n;
         if(n==0){
             return 1;
         }
         if(m<0){
             n*=(-1);
             double p=x*myPow(x, n-1);
             return 1/p;
         }
         double p=x*myPow(x, n-1);
         return p;
     }
     public static void main(String[] args) {
         System.out.println(myPow(2.00,-2 ));
     }
 }
 
 //         if (n == 0) return 1;
         
 //         long exp = n; // Convert to long to handle Integer.MIN_VALUE
 //         if (exp < 0) {
 //             x = 1 / x;
 //             exp = -exp;
 //         }
         
 //         double result = 1;
 //         while (exp > 0) {
 //             if ((exp & 1) == 1) { // If exponent is odd, multiply x with result
 //                 result *= x;
 //             }
 //             x *= x; // Square the base
 //             exp >>= 1; // Divide exponent by 2
 //         }
 //         return result;