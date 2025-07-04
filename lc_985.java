public class lc_985 {
     public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum=0;
        for(int x:nums){
            if(x%2==0){
                sum+=x;
            }
        }

        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int idx=queries[i][1];
            int val=queries[i][0];
            sum-=(nums[idx]%2==0)?nums[idx]:0;
            nums[idx]+=val;
            sum+=(nums[idx]%2==0)?nums[idx]:0;
            res[i]=sum;
        }
        return res;
     }
     public static void main(String[] args) {
          int nums[]={1,2,3,4};
          int q[][]={{1,0},{-3,1},{-4,0},{2,3}};
          for(int x:sumEvenAfterQueries(nums, q)){
               System.out.print(x+" ");
          }
     }
}
