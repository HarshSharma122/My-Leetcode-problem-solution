import java.util.Arrays;

public class H_InDex_Important_question {
    public static int h_index(int[] nums)
    {
        Arrays.sort(nums);
        int n  = nums.length;
        for (int i = 0; i<nums.length; i++)
        {
            if (nums[i]>= n-i)
            {
                return n-i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {3,0,6,1,5};
        System.out.println(h_index(nums));
    }
}
