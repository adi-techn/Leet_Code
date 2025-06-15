import java.util.HashMap;

public class lc_1248 {
     public static int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int sum=0,count=0;
        for(int x:nums){
            sum+=x;
            count+=hm.getOrDefault(sum-k,0);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
     }
     public static void main(String[] args) {
          int arr[]={1,1,2,1,1};
          System.out.println(numberOfSubarrays(arr, 3));
     }
}
