public class Largest_Number_At_Least_Twice_of_Others {
    public static int dominentIndex(int [] nums)
    {
        int ans = 0;

        for (int i = 0; i< nums.length-1; i++)
        {
            if (nums[i]<nums[i+1])
            {
                if (nums[i]*2==nums[i+1])
                {
                    ans = i+1;
                }else
                {
                    ans = -1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,6,1,0};
        System.out.println(dominentIndex(nums));
    }
}
