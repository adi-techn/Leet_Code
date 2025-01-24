public class lc_2529{
     public static int maximumCount(int[] nums){
          int neg=0;
          int si=0,ei=nums.length-1,mid=-1;
          while(si<=ei){
               mid=si+(ei-si)/2;
               if(nums[ei]<0){
                    neg+=ei-si+1;
                    break;
               }
               else if(nums[mid]<0){
                    neg+=(mid-si)+1;
                    if(nums[mid+1]>=0){
                         break;
                    }
                    else{
                         si=mid+1;
                    }
               }
               else if(nums[mid]>=0){
                    ei=mid-1;
               }
          }
          System.out.println(neg);
          int pos=0;
          si=0;ei=nums.length-1;mid=-1;
          while(si<=ei){
               mid=si+(ei-si)/2;
               if(nums[si]>0){
                    pos+=ei-si+1;
                    break;
               }
               else if(nums[mid]>0){
                    pos+=(ei-mid)+1;
                    if(mid!=0 && nums[mid-1]<=0){
                         break;
                    }
                    else{
                         ei=mid-1;
                    }
               }
               else{
                    si=mid+1;
               }
          }
          System.out.println(pos);
          if(neg>=pos){
               return neg;
          }else{
               return pos;
          }
     }
     public static void main(String[] args) {
          int arr[]={-2,-1,-1,1,2,3};
          System.out.println(maximumCount(arr));
     }
}