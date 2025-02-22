public class lc_852 {
     public static int peakIndex(int arr[]){
          int si=0,ei=arr.length-1;
          while(si<ei){
               int mid=si+(ei-si)/2;
               if(arr[mid]<arr[mid+1])
                    si=mid+1;
               else{
                    ei=mid;
               }
          }
          return si;
     }
     public static void main(String[] args) {
          int arr[]={0,2,1,0};
          System.out.println(peakIndex(arr));
     }
}
