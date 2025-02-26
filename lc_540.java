public class lc_540{
     public static int single_element(int arr[]){
          if(arr.length==1 || arr[0]!=arr[1])
               return arr[0];
          if(arr[arr.length-1]!=arr[arr.length-2])
               return arr[arr.length];
          int si=1,ei=arr.length-2,mid=-1;
          while(si<=ei){
               mid=si+(ei-si)/2;
               if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
                    return arr[mid];
               else if((mid%2!=0)&&(arr[mid]==arr[mid-1])){
                    si=mid+1;
               }
               else{
                    ei=mid-1;
               }
          }
          return -1;
     }
     public static void main(String[] args) {
          int arr[]={1,1,3,3,4,5,5,8,8};
          System.out.println(single_element(arr));
     }
}
