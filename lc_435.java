import java.util.Arrays;
import java.util.Comparator;

public class lc_435 {
  public static int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingDouble(o -> o[1]));

    int count=0;
    int lastEnd=intervals[0][1];
    for(int i=1;i<intervals.length;i++){
      if(lastEnd>intervals[i][0]){
          count++;
      }
      else{
          lastEnd=intervals[i][1];
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int activity[][]={{1,2},{2,3}};
    System.out.println(eraseOverlapIntervals(activity));
  }
}
