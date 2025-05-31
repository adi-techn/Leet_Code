import java.util.HashSet;

public class lc_2799 {
     public static int countCompleteSubarrays(int[] nums) {
        int count=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int x:nums){
            hs.add(x);
        }
        
        for(int i=0;i<nums.length;i++){
          HashSet<Integer> hs1=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                hs1.add(nums[j]);
                if(hs1.size()==hs.size()){
                    count++;
                }
            }
        }
        return count;
     }
     public static void main(String[] args) {
          int arr[]={1,3,1,2,2};
          System.out.println(countCompleteSubarrays(arr));
     }
}
