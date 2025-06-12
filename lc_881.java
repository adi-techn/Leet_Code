import java.util.Arrays;

public class lc_881 {
     public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        /*
        int p1,p2;
        for(int i=0;i<people.length-1;){
            int l=limit;
            p1=people[i];
            p2=people[i+1];
            if(p1+p2<=l){
                count++;
                i++;
            }else{
                count+=2;
                i+=2;
            }
        }*/
        int i=0,j=people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
            }
            j--;
            count++;
        }
        return count;
     }
     public static void main(String[] args) {
          int people[]={3,2,2,1};
          System.out.println(numRescueBoats(people, 3));
     }
}
