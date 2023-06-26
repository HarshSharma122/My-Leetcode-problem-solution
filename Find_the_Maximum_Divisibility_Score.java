//public class Find_the_Maximum_Divisibility_Score {
//    public static int maxDiv(int[] nums, int[] divisors)
//    {
//        int ans = 0;
//        for (int i = 0; i<nums.length; i++)
//        {
//            for (int j = 0; j<divisors.length; j++)
//            {
//                if (nums[i]%divisors[j]==0)
//                {
//                    ans = divisors[j];
//                }
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int[] nums = {4,7,9,3,9};
//        int[] divisors = {5,2,3};
//        System.out.println(maxDiv(nums, divisors));
//    }
//}
