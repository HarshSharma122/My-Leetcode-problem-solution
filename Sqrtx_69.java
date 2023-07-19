public class Sqrtx_69 {
    public static int sqrt(int x)
    {
        int start = 0;
        int end = x;
        while (start<=end)
        {
            long mid = (start + end)/2;

            long ans = mid * mid;
            if (ans<=(long) x)
            {
                start = (int)(mid + 1);
            }else
            {
                end = (int) (mid - 1);
            }

        }
        return end;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(16));

    }
}
