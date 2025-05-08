import java.util.ArrayList;
import java.util.List;

public class lc_78 {
     public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());  //Empty subset
        for(int x:nums){
            int s=result.size();
            for(int i=0;i<s;i++){
                List<Integer> arr=new ArrayList<>(result.get(i));
                arr.add(x);
                result.add(arr);
            }
        }
        return result;
     }
     public static void main(String[] args) {
          int arr[]={1,2,3};
          System.out.println(subsets(arr));
     }
}
