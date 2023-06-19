public class convert_to_fliping {
    public static int flip(int x, int y)
    {
        return count(x^y);
    }
    public static int count(int n)
    {
        int ans = 0;
        while (n!=0)
        {
            ans++;
            n&=(n-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(flip(10, 7));

    }
}
