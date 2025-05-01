public class lc_1295 {
     public static int findNumbers(int[] nums) {
          int count=0;
          for(int x:nums){
              int c=0;
              while(x!=0){
                  c++;
                  x/=10;
              }
              if(c%2==0){
                  count++;
              }
          }
          return count;
     }
     public static void main(String[] args) {
          int arr[]={12,345,2,6,7896};
          System.out.println(findNumbers(arr));
     }
}
