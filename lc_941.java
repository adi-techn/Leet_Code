public class lc_941{
     public static boolean validMountainArray(int[] arr) {
          int n=arr.length;
        if(n>=3){
            int max=Integer.MIN_VALUE;
            int m=0;
            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    max=arr[i];
                    m=i;
                }
            }
            if(m==n-1 || m==0){
                return false;
            }
            int c=0;
            for(int i=0;i<m;i++){
                if(arr[i]<arr[i+1]){
                    c++;
                }
            }
            for(int i=m;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    c++;
                }
            }
            if(c==n-1){
                return true;
            }
        }
        return false;
     }
     public static void main(String[] args) {
          int arr[]={0,1,2,3,4,5,6,7,8,9};
          System.out.println(validMountainArray(arr));
     }
}
