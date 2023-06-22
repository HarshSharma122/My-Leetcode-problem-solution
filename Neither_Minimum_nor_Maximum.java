import java.util.Arrays;

public class Neither_Minimum_nor_Maximum {
    public static int findNonMinOrMax(int[] nums)
    {
        Arrays.sort(nums); // 1,2,3,4
        int min = nums[0];
        int max = nums[0];
        if (nums.length==2 && nums.length==1)
        {
            return -1;
        }
        return nums[1];
    }
    public static void main(String[] args) {
        int[]nums = {3,2,1,4};
        System.out.println(findNonMinOrMax(nums));
    }
}
