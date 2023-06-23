import java.util.Arrays;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static int findMin(int[] nums)
    {
        Arrays.sort(nums);
        int min = nums[0];
        for (int i = 1; i<nums.length; i++)
        {
            min = Math.min(min, nums[i]);
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
}
