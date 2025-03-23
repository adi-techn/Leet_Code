public class lc_2425{
     public static int xorAllNums(int[] num1, int[] num2) {
          int xor=0;
          if(num1.length%2==1){
               for(int j=0;j<num2.length;j++){
                    xor^=num2[j];
               }
          }
          if(num2.length%2==1){
               for(int j=0;j<num1.length;j++){
                    xor^=num1[j];
               }
          }

          // T.C. = O(n*m)
          // int xor;
          // for(int i=0;i<num1.length;i++){
          //      for(int j=0;j<num2.length;j++){
          //           xor^=(num1[i]^num2[j]);
          //      }
          // }
          
          return xor;
     }
     public static void main(String[] args) {
          int num1[]={2,1,3};
          int num2[]={10,2,5,0};
          System.out.println(xorAllNums(num1,num2));
     }
}
