public class Minimum_Comman_value_in_two_array {
    public static int getComman(int[]nums1, int[]nums2)
    {
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]nums1 = {1,35,578, 6868, 585858};
        int[]nums2 = {3363, 37337, 585858};
        System.out.println(getComman(nums1, nums2));
    }
}
