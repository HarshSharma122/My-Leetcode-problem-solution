import java.util.Arrays;

public class First_Missing_positive {
    public static int missingNum(int[] nums)
    {
         int abc = 1;
         for (int i =0 ; i<nums.length;i++)
         {
             if (nums[i]==abc)
             {
                 abc++;
             }
         }
         return abc;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(missingNum(nums));
    }
}
