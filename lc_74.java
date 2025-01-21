public class lc_74{
     public static boolean searchMatrix(int[][] arr,int t){
          for(int i=0;i<arr.length;i++){
               if(t>arr[i][arr[0].length-1])
                    continue;
               int si=0,ei=arr[0].length-1,mid=-1;
               while(si<=ei){
                    mid=si+(ei-si)/2;
                    if(arr[i][mid]==t)
                         return true;
                    else if(arr[i][mid]<t)
                         si=mid+1;
                    else{
                         ei=mid-1;
                    }
               }
          }
          return false;
     }
     public static void main(String[] args) {
          int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
          System.out.println(searchMatrix(arr,50));
     }
}