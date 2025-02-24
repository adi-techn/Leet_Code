public class lc_912 {
     public static int[] sortArray(int[] nums) {
          return mergeSort(nums,0,nums.length-1);
     }
     public static int[] mergeSort(int arr[],int si,int ei){
          int mid=(si+ei)/2;
          if(si>=ei)
              return arr;
          mergeSort(arr, si, mid);    //Left
          mergeSort(arr, mid+1, ei);  //Right
          merge(arr,si,mid,ei);
          return arr;
     }
     public static void merge(int arr[],int si,int mid,int ei){
           int temp[]=new int[ei-si+1];
           int i=si;
           int j=mid+1;
           int k=0;
   
           while(i<=mid && j<=ei){
               if(arr[i]<arr[j]){
                   temp[k]=arr[i++];
               }
               else{
                   temp[k]=arr[j++];
               }
               k++;
           }
           while(i<=mid){
               temp[k++]=arr[i++];
           }
           while(j<=ei){
               temp[k++]=arr[j++];
           }
           for(int l=0,m=si;l<temp.length;m++,l++){
               arr[m]=temp[l];
           }
     }
     public static void main(String[] args) {
          int arr[]={1,12,67,5,9,4,7};
          sortArray(arr);
          for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+" ");
          }
     }
}
