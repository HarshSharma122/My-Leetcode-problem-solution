import java.util.Arrays;
public class Divide_Array_Into_Equal_Pairs_2206 {
    public static boolean divideArray(int[]nums)
    {
        int process = 0;
        Arrays.sort(nums);
        for (int i = 0; i<nums.length-1; i+=2)
        {
            int length = nums.length/2;
            if (nums[i]==nums[i+1])
            {
                process++;
                if (process==length)
                {
                    return true;
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int[]nums = {3,2,3,2,2,2};
        System.out.println(divideArray(nums));
    }
}
