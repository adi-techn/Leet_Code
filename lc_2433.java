public class lc_2433{
     public static int[] findArray(int[] pref) {
          int arr[]=new int[pref.length];
  
          arr[0]=pref[0];
          int i=1,j=0;
          while(i<pref.length && j<i){
               int xor=pref[j];
               j++;
               arr[i]=xor^pref[j];
               i++;
          }
          for(int r=0;r<arr.length;r++){
               System.out.print(arr[r]+" ");
          }
          return arr;
     }
     public static void main(String[] args) {
          int pref[]={5,2,0,3,1};
          findArray(pref);
     }
}