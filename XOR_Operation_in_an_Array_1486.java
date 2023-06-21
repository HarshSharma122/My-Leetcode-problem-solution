public class XOR_Operation_in_an_Array_1486 {
    public static int xorOperation(int n, int start)
    {
        int result = 0;
        int ans = 0;
        for (int i =0; i<n; i++)
        {
            result = start + 2 * i;
            ans = ans^result;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(xorOperation(5,0));
    }
}
