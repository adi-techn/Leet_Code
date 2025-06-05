import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class lc_442 {
     public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int key:hm.keySet()){
            if(hm.get(key)==2){
                arr.add(key);
            }
        }
        return arr;
     }
     public static void main(String[] args) {
          int nums[]={4,3,2,7,8,2,3,1};
          System.out.println(findDuplicates(nums));
     }
}
