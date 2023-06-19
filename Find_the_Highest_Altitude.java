public class Find_the_Highest_Altitude {
    public static int largestAltitude(int[]nums)
    {
        int prefix[]=new int[nums.length];
        //initializing first element
        prefix[0] = nums[0];
        for (int i = 1; i<nums.length; i++) {
            prefix[i] = prefix[i - 1] + prefix[i];
        }
        int largest = 0;
        for (int i = 0; i<prefix.length; i++)
        {
            if (prefix[i]>largest)
            {
                largest =  prefix[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[]nums = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(nums));
    }
}