public class Majority_Element {
    public static int majorityElement(int[]nums)
    {
        int ansIndex = 0;
        int count = 1;
        for (int i = 0; i<nums.length; i++)
        {
            if (nums[i]==nums[ansIndex])
            {
                count++;
            }else

            {
                count--;
            }
            if (count==0)
            {
                ansIndex = i;
                count = 1;

            }
        }

        return nums[ansIndex];
    }
    public static void main(String[] args) {
        int[]nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
