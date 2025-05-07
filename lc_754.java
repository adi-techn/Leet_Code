public class lc_754 {
     public static int reachNumber(int target) {
          target = Math.abs(target);
          int i = 0;
          int si = 0;
          while (si < target || (si - target) % 2 != 0) {
              i++;
              si += i;
          }
          return i;
     }
     public static void main(String[] args) {
          System.out.println(reachNumber(5));          
     }
}
