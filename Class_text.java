import java.util.Arrays;
import java.util.Stack;

public class Class_text {
    public static int classTest(int n, int arr[], int k) {
      Arrays.sort(arr);
      return arr[n-k];
    }
    public static void main(String[] args) {
        int[] arr = {3,4,4, 5,6,7,7,8,8};
        System.out.println(classTest(9, arr, 1));
    }
}