import java.util.PriorityQueue;

public class lc_1985 {
     public static String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->{
            if(a.length()!=b.length()){
                return b.length()-a.length();
            }
            return b.compareTo(a);
        });

        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        String str="";
        for(int i=0;i<k;i++){
            str=pq.remove();
        }
        return str;
     }
     public static void main(String[] args) {
          String str[]={"3","6","7","10"};
          int k=4;

          System.out.println(kthLargestNumber(str, k));
     }
}
