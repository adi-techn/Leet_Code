import java.util.HashMap;

public class lc_1365 {
     public static int[] smallerNumbersThanCurrent(int[] nums) {
          HashMap<Integer, Integer> hm = new HashMap<>();
          int ans[] = new int[nums.length];

          for (int x : nums) {
               hm.put(x, hm.getOrDefault(x, 0) + 1);
          }

          int cnt;
          for (int i = 0; i < nums.length; i++) {
               cnt = 0;
               for (int key : hm.keySet()) {
                    if (key < nums[i]) {
                         cnt += hm.get(key);
                    }
               }
               ans[i] = cnt;
          }

          return ans;
     }

     public static void main(String[] args) {
          int nums[]={8,1,2,2,3};
          for(int x : smallerNumbersThanCurrent(nums)){
               System.out.print(x+" ");
          }
     }
}
