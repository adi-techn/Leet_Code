import java.util.HashMap;

public class lc_2364 {
     public static long countBadPairs(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm= new HashMap<>();
        long good=0;
        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i]-i)){
                good+=(long)hm.get(nums[i]-i);
            }
            hm.put(nums[i]-i,hm.getOrDefault(nums[i]-i,0)+1);
        }
        return (long)n*(n-1)/2-good;
     }
     public static void main(String[] args) {
          int nums[]={4,1,3,3};
          System.out.println(countBadPairs(nums));
     }
}
