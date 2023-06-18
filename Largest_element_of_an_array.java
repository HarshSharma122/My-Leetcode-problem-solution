public class Largest_element_of_an_array {
    public static int largestEle(int[]nums)
    {
        int largest = -1;
        int index = -1;
        for (int i =0; i<nums.length; i++)
        {
            if (nums[i]>largest)
            {
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[]nums = {2,4,49,100,4};
        System.out.println(largestEle(nums));

    }
}
