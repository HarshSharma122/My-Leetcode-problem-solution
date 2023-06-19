public class Hamming_distances_is_improved {
    public static int hammingDistance(int x, int y) {
        int ans = x^y;
        int result = 0;
        while (ans>0)

        {
            result += ans&1;
            ans>>=1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(hammingDistance(3,1));
    }
}
