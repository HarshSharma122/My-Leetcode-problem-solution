public class Monotonic_array {
    public static boolean isMonotonic(int[] nums)
    {
        boolean in = true;
        boolean dec = true;
        for (int i = 0; i<nums.length-1; i++)
        {
            if (nums[i]>nums[i+1])
            {
                in = false;
            }
        }
        for (int j = 0; j<nums.length-1; j++)
        {
            if (nums[j]<nums[j+1])
            {
                dec = false;
            }
        }
        return in||dec;
    }
    public static void main(String[] args) {
        int[]nums = {6,5,4,4};
        System.out.println(isMonotonic(nums));
    }
}