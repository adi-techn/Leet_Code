public class lc_2654 {
     public static int minOperations(int[] nums) {
          int cnt = 0, ones = 0;
          int idx = -1;
          for (int i = 0; i < nums.length; i++) {
               if (nums[i] == 1) {
                    ones++;
               }
          }

          if (ones > 0) {
               // cnt+=(idx-0); //left side
               // cnt+=(nums.length-1-idx)-c; //right side

               return nums.length - ones;

          }

          int minLen = Integer.MAX_VALUE;
          for (int i = 0; i < nums.length; i++) {
               int g = nums[i];
               for (int j = i + 1; j < nums.length; j++) {
                    g = gcd(g, nums[j]);
                    if (g == 1) {
                         minLen = Math.min(minLen, j - i + 1);
                         break;
                    }
               }
          }
          // System.out.println(minLen);
          if (minLen == Integer.MAX_VALUE) {
               return -1;
          }

          return (minLen - 1) + (nums.length - 1);
     }

     public static int gcd(int n1, int n2) {
          if (n2 == 0) {
               return n1;
          }
          return gcd(n2, n1 % n2);
     }

     public static void main(String[] args) {
          int nums[]={6,10,15};
          System.out.println(minOperations(nums));
     }
}
