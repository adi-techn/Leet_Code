public class lc_1550 {
     public static boolean threeConsecutiveOdds(int[] arr) {
          int c=0;
          for(int i=0;i<arr.length;i++){
              if(arr[i]%2!=0){
                  c++;
                  if(c==3){
                      return true;
                  }
              }else{
                  c=0;
              }
          }
          return false;
     }
     public static void main(String[] args) {
          int arr[]={2,3,5,7,4};
          System.out.println(threeConsecutiveOdds(arr));
     }
}
