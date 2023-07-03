import java.util.Arrays;

public class Find_Greatest_Common_Divisor_of_Array {
    public static int findGcd(int[] nums)
    {
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
         for (int e: nums)
         {
             min = Math.min(e, min);
             max = Math.max(e, max);
         }
         while (min>0)
         {
             int temp = min;
             min = max % min;
             max = temp;
         }
         return max;
    }

    public static void main(String[] args) {
//        int[] nums  = {2,5,6,9,10};
        int[] nums  = {7,5,6,8,3};
        System.out.println(findGcd(nums));
    }
}
