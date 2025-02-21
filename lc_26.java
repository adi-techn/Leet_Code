public class lc_26 {
     public static int removeDuplicates(int[] nums) {
          int aux[]=new int[nums.length];
          aux[0]=nums[0];
          int j=0,c=1;
          for(int i=1;i<nums.length;i++){
              if(aux[j]!=nums[i]){
                  aux[++j]=nums[i];
                  c++;
              }
          }
          for(int i=0;i<nums.length;i++){
              nums[i]=aux[i];
          }
          return c;
     }
     public static void main(String[] args) {
          int arr[]={0,0,1,1,1,2,3,3};
          System.out.println(removeDuplicates(arr));
     }
}
