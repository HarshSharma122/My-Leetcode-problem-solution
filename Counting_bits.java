public class Counting_bits {
    public static int[] countBits(int n)
    {
        int[] arr = new int[n+1];
        for (int i = 1; i<=n; i++){
            arr[i] = arr[i/2] + i%2;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(countBits(2));
    }
}
