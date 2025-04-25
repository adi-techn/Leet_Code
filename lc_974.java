public class lc_974 {
     public static int subarraysDivByK(int[] nums, int k) {
          int count=0,sum=0;
  
          int mod[]=new int[k];
          mod[0]=1;
  
          for(int i=0;i<nums.length;i++){
              sum+=nums[i];
              int m=sum%k;
              if(m<0){
                  m+=k;
              }
              count+=mod[m];
              mod[m]++;
          }
          return count;
     }
     public static void main(String[] args) {
          int num[]={4,5,0,-2,-3,1};
          System.out.println(subarraysDivByK(num, 5));
     }
}
