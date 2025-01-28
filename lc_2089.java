import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc_2089{
     public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> a=new ArrayList();
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                a.add(n++,i);
            }
        }
        return a;
    }
     public static void main(String[] args) {
          int arr1[]={1,2,5,2,3};
          System.out.println(targetIndices(arr1,2));
     }
}
