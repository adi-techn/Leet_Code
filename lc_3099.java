public class lc_3099{
     public static int harshad(int num){
         int m=num;
         int sum=0;
         while(m!=0){
             int r=m%10;
             sum+=r;
             m/=10;
         }
         if(num%sum==0){
             return sum;
         }
         return -1;
     }
     public static void main(String[] args) {
         System.out.println(harshad(23));
     }
 }