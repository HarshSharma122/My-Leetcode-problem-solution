import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Intersection_of_two_array {
    public static int[] intersection(int[] nums1, int[] nums2)
    {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i<nums1.length; i++)
         {
            set.add(nums1[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();


        for (int i = 0; i<nums2.length; i++)
        {
            if (set.contains(nums2[i])) {
                ans.add(nums2[i]);
                set.remove(nums2[i]);

            }
        }
        int[] arr = new int[ans.size()];
        for (int i = 0; i<ans.size(); i++)
        {
            arr[i] = ans.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(intersection(nums1, nums2));

    }
}
