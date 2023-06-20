import java.util.Arrays;

public class Missing_number {
    public static int missingNumber(int[]nums)
    {
        int xor = 0;
        for(int ans: nums)
        {
            xor = xor ^ ans;
        }
        for(int i = 0; i<=nums.length;i++)
        {
            xor = xor ^ i;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[]nums = {0,1};
        System.out.println(missingNumber(nums));
    }
}
