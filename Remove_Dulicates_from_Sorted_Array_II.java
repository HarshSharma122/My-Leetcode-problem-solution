public class Remove_Dulicates_from_Sorted_Array_II {
    public static int removeDublicate(int[] nums)
    {
        if (nums.length<=2)
        {
            return nums.length;
        }
        int count = 1;
        int occurencs = 1;
        int k =2;
        for (int i = 1; i< nums.length; i++)
        {
            if (nums[i]==nums[i-1])
            {
                occurencs++;
            }else
            {
                occurencs = 1;
            }
            if (occurencs<=k)

            {
                nums[count] = nums[i];
                count++;
            }

        }
        return count;



    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDublicate(nums));
    }
}
