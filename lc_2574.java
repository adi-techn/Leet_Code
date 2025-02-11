public class lc_2574{
     public static int[] lsSumDiff(int arr[]){
          int totalsum=0;
          for(int i=0;i<arr.length;i++){
               totalsum+=arr[i];
          }
          int leftSum[]=new int[arr.length],ls=0;
          for(int i=0;i<arr.length;i++){
               leftSum[i]=ls;
               ls+=arr[i];
          }
          int rightSum[]=new int[arr.length];
          for(int i=0;i<arr.length;i++){
               totalsum-=arr[i];
               rightSum[i]=totalsum;
          }
          int answer[]=new int[arr.length];
          for(int i=0;i<answer.length;i++){
               int a=leftSum[i]-rightSum[i];
               if(a<0){
                    a=a*(-1);
               }
               answer[i]=a;
          }
          return answer;
     }
     public static void main(String[] args) {
          int arr[]={1};
          lsSumDiff(arr);
     }
}
