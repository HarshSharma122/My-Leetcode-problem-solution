public class Minimum_Comman_value_in_two_array {
    public static int getComman(int[]nums1, int[]nums2)
    {
        // THAT IS TRUE FOR SMALL CASES BUT THIS GAVE ME AN ERROR
       /* for (int i = 0; i<nums1.length; i++)
        {
            for (int j = 0; j<nums2.length; j++)
            {
                if (nums1[i]==nums2[j])
                {
                    return nums1[i];
                }
            }
        }
        return -1;*/


        int i = 0;
        int j = 0;

        while (i<nums1.length && j<nums2.length)
        {
            if (nums1[i]==nums2[j])
            {
                return nums1[i];
            } else if (nums1[i]<nums2[j]) {
                i++;
            }else
            {
                j++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]nums1 = {1,2,3};
        int[]nums2 = {2,4};
        System.out.println(getComman(nums1, nums2));
    }
}
