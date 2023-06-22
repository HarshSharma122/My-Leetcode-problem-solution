public class two_Sum {
    public static int twoSum(int[] nums) {
        long n = nums.length;
        int ans = 0;
        for (int i = 1; i<n-1; i++)
        {
            long left = nums[i];
            for (int j = 0; j<i; j++)
            {
                left = Math.max(left, nums[j]);
            }
            long right = nums[i];
            for (int j= i+1; j<n; j++)
            {
                right = Math.max(right, nums[j]);

            }

            ans += Math.min(left, right) - nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {};
        System.out.println(twoSum(nums));
    }
}
