import java.util.Arrays;

public class lc_2679 {
     public static int matrixSum(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;

        for(int i=0;i<n;i++){
            Arrays.sort(nums[i]);
        }
        int sum=0;
        for(int i=m-1;i>=0;i--){
            int max=0;
            for(int j=0;j<n;j++){
                max=Math.max(max,nums[j][i]);
            }
            sum+=max;
        }
        return sum;
     }
     public static void main(String[] args) {
          int nums[][]={{7,2,1},{6,4,2},{6,5,3},{3,2,1}};
          System.out.println(matrixSum(nums));
     }
}
