public class Binary_search_using_recursion {

    public static int solve(int[] arr, int s, int e, int target)
    {
        int mid = s + (e - s)/2;
        // base case
        if (s>e)
        {
            return -1;
        }
        if (arr[mid]==target)
        {
            return mid;
        }


        if (arr[mid]<target)
        {
            return solve(arr, mid+1, e, target);
        }else
        {
            return solve(arr, s, e-1, target);
        }
    }

    public static int search(int [] nums, int target)
    {
        int s = 0;
        int e = nums.length-1;
        return solve(nums, s, e, target);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(search(arr, 4));
    }
}
