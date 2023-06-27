public class Max_consecutive_ones {
    public static int findMaxConsecutiveOnes(int[] nums)
    {
       int j = 0;
       int max = 0;
       for (int i = 0; i<nums.length; i++) // iterate the loop from 0th index to n index
       {
           if (nums[i]==0)
           {
               max = Math.max(max, j);
               j = 0;// this line is indicate that after use of j the value of j is 0;
           }else
           {
               j++;
           }
       }
       return Math.max(max, j);
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }
}
