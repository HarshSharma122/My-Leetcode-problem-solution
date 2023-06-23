public class Check_array_is_sorted_and_rotated {
    public static boolean check(int[] nums)
    {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i<n; i++)
        {
            if (nums[i]>nums[(i+1)%n])
            {
                ++count;
            }
        }
        return (count<=1);
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
//        int[] nums = {3,6,10,1,8,9,9,8,9};
        System.out.println(check(nums));
    }
}
