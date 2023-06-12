public class merge_two_sorted_array {
    public static void merge(int [] arr1, int n, int []arr2, int m, int[]arr3)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<n && j<m)
        {
            if (arr1[i]<arr2[j])
            {
                arr3[k++] = arr1[i++];
            }else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i<n)
        {
            arr3[k++]= arr1[i++];
        }
        while (j<m)
        {
            arr3[k++]= arr2[j++];
        }
    }
    public static void ans(int[]arr3)
    {
        for (int i = 0; i<arr3.length; i++)
        {
            System.out.println(arr3[i]);
        }
    }
    public static void main(String[] args) {
        int[]arr1 = {1,3,5,7,9};
        int[]arr2 = {2,4,6};
        int [] arr3 = new int[8];
        merge(arr1, 5,arr2, 3, arr3);
        ans(arr3);

    }
}
