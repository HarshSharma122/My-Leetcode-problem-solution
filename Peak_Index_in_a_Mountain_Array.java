public class Peak_Index_in_a_Mountain_Array {
    public static int peakIndexInMountainArray(int[] arr) {
//        int ans = 0;
//        for (int i = 0; i<arr.length-1; i++)
//        {
//            if (arr[i]<arr[i+1])
//            {
//                ans =  i+1;
//            }
//        }
//        return ans;

         int s= 0;
         int e = arr.length-1;
         while (s<e)
         {
             int mid = s + (e-s/2);
             if (arr[mid] <arr[mid+ 1])
             {
                 s = mid + 1;
             }else
             {
                 e = mid;
             }
             mid = s + (e-s/2);
         }
         return s;
    }
    public static void main(String[] args) {
        int[]arr = {0, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
