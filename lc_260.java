public class lc_260 {
     public static int[] singleNumber(int nums[]){
          int xor=0;
          for(int x:nums){
               xor^=x;
          }
          int setbit=xor & (-xor);

          int ans[]=new int[2];
          for(int x:nums){
               if((setbit&x)==0){
                    ans[0]^=x;
               }
               else{
                    ans[1]^=x;
               }
          }
          // for(int x:ans){
          //      System.out.print(x+" ");
          // }
          return ans;
     }
     public static void main(String[] args) {
          int arr[]={1,2,1,3,2,5};
          singleNumber(arr);
     }
}
