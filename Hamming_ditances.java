public class Hamming_ditances {
    public static int countBits(int n)
    {
        int ans = 0;
        for (int i = 0; i<32; i++)// Here we use 32 bit unsigned integer

        {
            if ((n&1)==1)
            {
                ans++;
            }
            n>>=1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(countBits(00000000000000000000000000001011));
    }
}
