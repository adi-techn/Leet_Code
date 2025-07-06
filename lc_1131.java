public class lc_1131 {
     public static int maxAbsValExpr(int[] arr1, int[] arr2) {
        int max1=Integer.MIN_VALUE , min1=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE , min2=Integer.MAX_VALUE;
        int max3=Integer.MIN_VALUE , min3=Integer.MAX_VALUE;
        int max4=Integer.MIN_VALUE , min4=Integer.MAX_VALUE;

        for(int i=0;i<arr1.length;i++){
            int a=arr1[i],b=arr2[i];

            max1 = Math.max(max1, a + b + i);
            min1 = Math.min(min1, a + b + i);

            max2=Math.max(max2,a+b-i);
            min2=Math.min(min2,a+b-i);

            max3=Math.max(max3,a-b+i);
            min3=Math.min(min3,a-b+i);

            max4=Math.max(max4,a-b-i);
            min4=Math.min(min4,a-b-i);
        }

        int res=0;
        res=Math.max(res,max1-min1);
        res=Math.max(res,max2-min2);
        res=Math.max(res,max3-min3);
        res=Math.max(res,max4-min4);

        return res;
     }
     public static void main(String[] args) {
          int arr1[]={1,2,3,4};
          int arr2[]={-1,4,5,6};

          System.out.println(maxAbsValExpr(arr1, arr2));
     }
}
