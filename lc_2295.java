import java.util.HashMap;

public class lc_2295{
     public static int[] arrayChange(int[] nums, int[][] op) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<op.length;i++){
            if(hm.containsKey(op[i][0])){
                int idx=hm.get(op[i][0]);
                nums[idx]=op[i][1];
                hm.remove(op[i][0]);
                hm.put(op[i][1],idx);
            }
        }
        return nums;
     }
     public static void main(String[] args) {
          int nums[]={1,2,4,6};
          int op[][]={{1,3},{4,7},{6,1}};
          for(int x:arrayChange(nums, op)){
               System.out.print(x+" ");
          }
          
     }
}