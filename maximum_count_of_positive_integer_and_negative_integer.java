public class maximum_count_of_positive_integer_and_negative_integer {
    public static int maximum(int[]nums)
    {
        int count = 1;
        int ans = 0;
        int ans1 = 0;
        int count1  = 1;
        int result = 0;
        for (int i= 0; i<nums.length; i++) {
            if (nums[i]>0)
            {
                ans = count++;
            } else if (nums[i]<0) {
                ans1 = count1++;
            }
        }
        if (ans>ans1)
        {
            result = ans;
        }
        else {
            result =  ans1;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(maximum(nums));
    }
}
