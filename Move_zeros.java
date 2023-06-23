public class Move_zeros {
    public static void move(int[] nums)
    {
        int ans = 0;
        for (int i =0 ; i< nums.length; i++)
        {
            if (nums[i]!=0)
            {
                int temp = nums[i];
                nums[i] = nums[ans];
                nums[ans] = temp;
                ans++;
                System.out.println(temp);
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        move(nums);
    }
}
