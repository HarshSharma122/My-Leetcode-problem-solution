public class Sum_of_2 {
    public static int[] twoSum(int[] numbers, int target)
    {
        // Here two pointer approach work
        int s = 0;
        int e = numbers.length-1;
        while (s<=e)
        {
            if (numbers[s] + numbers[e] == target)
            {
                return new int[]{s + 1, e + 1};
            } else if (numbers[s] + numbers[e]>target) {
                e -=1;
            }else
            {
                s += 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        System.out.println(twoSum(nums, 9 ));
    }
}
