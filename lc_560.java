import java.util.HashMap;

public class lc_560 {
     public static int subarraySum(int[] nums, int k) {
          HashMap<Integer,Integer> hm=new HashMap<>();
          int sum=0;
          int count=0;

          //Storing (0,1) for element == k
          hm.put(0,1);

          for(int i=0;i<nums.length;i++){
               sum+=nums[i];
               if(hm.containsKey(sum-k)){
                    count+=hm.get(sum-k);
               }
               hm.put(sum,hm.getOrDefault(sum,0)+1);
          }
          return count;
     }
     public static void main(String[] args) {
          int arr[]={1,2,3};
          int k=3;
          System.out.println(subarraySum(arr, k));
     }
}
