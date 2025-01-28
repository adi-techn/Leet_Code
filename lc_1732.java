public class lc_1732{
     public static int highestAltitude(int arr[]){
         int ps[]=new int[arr.length+1];
         int t=ps[0];
         for(int i=0;i<arr.length;i++){
             ps[i+1]=ps[i]+arr[i];
             if(ps[i+1]>t){
                 t=ps[i+1];
             }
         }
         return t;
     }
     public static void main(String[] args) {
         int arr[]={-4,-3,-2,-1,4,3,2};
         System.out.println(highestAltitude(arr));
     }
 }
 