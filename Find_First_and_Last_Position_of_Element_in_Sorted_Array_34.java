public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 {
    public static int[] searchRange(int[]nums, int target)
    {
        int []result = new int[2];
        result[0] = getFirst(nums, target);
        result[1] = getSecond(nums, target);
        return result;
    }
    public static int getFirst(int[]nums, int target)
    {
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while (s<=e)
        {
            int mid = s + (e - s)/2;
            if (nums[mid]==target)
            {
                ans = mid;
                e = mid - 1;
            }
            if (nums[mid]>target)
            {
                e = mid - 1;
            }else
            {
                s = mid + 1;
            }

        }
        return ans;
    }
    public static int getSecond(int[]nums, int target)
    {
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while (s<=e)
        {
            int mid = s + (e - s)/2;
            if (nums[mid]==target)
            {
                ans = mid;
                s = mid + 1;
            }
            if (nums[mid]>target)
            {
                e = mid - 1;
            }else
            {
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]nums = {5,7,7,8,8,10};
        System.out.println(searchRange(nums, 8));
    }
}
