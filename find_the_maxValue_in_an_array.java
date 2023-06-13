public class find_the_maxValue_in_an_array {
    public static int getmaxValue(int[]nums)
    {
        int maxValue = 0;
        for (int i = 0; i<nums.length-1; i++)
        {
            if (nums[i]<nums[i+1])
            {
                maxValue = nums[i+1];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,100};
        System.out.println(getmaxValue(nums));

    }
}
