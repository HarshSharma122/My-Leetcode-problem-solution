public class Rotate_array_with_the_given_value {
    public static void rotate(int[] nums, int k)
    {
        int[] result = new int[nums.length];

        int j = 0;

        for (int i = k; i<result.length; i++)
        {
            result[i] = nums[j];
            j++;
        }
        for (int i = 0; i<k; i++)
        {
            result[i] = nums[j];
            j++;
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        rotate(nums, 3);
    }
}
