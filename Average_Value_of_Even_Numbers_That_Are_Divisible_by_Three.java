public class Average_Value_of_Even_Numbers_That_Are_Divisible_by_Three {
    public static int averge(int[]nums)
    {
        int count = 1;
        int result = 0;
        int ans = 0;
        int harsh = 0;
        for (int i = 0;i<nums.length; i++)
        {
            if (nums[i] %6==0) // 
            {

                ans = count++;
                if (ans>1)
                {
                    result += nums[i];
                    harsh =  result/ans;

                }else
                {
                    result += nums[i];
                    harsh =  result;
                }
            }

        }
        return harsh;
    }
    public static void main(String[] args) {
        int[]nums = {1,3,5,7,12,15};
        System.out.println(averge(nums));

    }
}
