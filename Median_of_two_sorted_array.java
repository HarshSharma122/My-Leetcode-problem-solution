import java.lang.reflect.Array;
import java.util.Arrays;

public class Median_of_two_sorted_array {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int o = m + n;
        int [] o1= new int[o];
        System.arraycopy(nums1, 0, o1, 0,m);
        System.arraycopy(nums2, 0, o1, m, n);
        Arrays.sort(o1);
        int v = o1.length;
        if (v%2!=0)
        {
            return (double) o1[v/2];
        }
        return (double) (o1[(v-1)/2] +o1[v/2])/2.0;
    }
    public static void main(String[] args) {
//        int[ ] nums1 = {1};
        int[ ] nums1 = {1,3};
        int[] nums2 = {2,7,6};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
}
