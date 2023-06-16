public class Apply_operation_to_an_array {
    public static int[] applyOperation(int[]nums)
    {
        for (int i = 0; i<nums.length-1; i++)
        {
            if (nums[i]==nums[i+1])
            {
                nums[i+1]=0;
                nums[i] *= 2;
                i++;
            }
        }
        int[]arr = new int[nums.length];
        int j = 0;
        for (int i = 0; i<nums.length; i++)
        {
            if (nums[i]!=0)
            {
                arr[j] = nums[i];
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,0};
        System.out.println(applyOperation(nums));
    }
}
