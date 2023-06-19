public class Hamming_distances_is_improved {
    public static int hammingDistance(int x, int y) {
        //The Hamming distance between two integers is the number of positions at which the corresponding bits are different
        int ans = x^y;
        int result = 0;
        while (ans>0)
        {
            result += ans&1;
            /* this is also work
             if((ans&1)==1)
             {
                 result++;
             }*/
            ans>>=1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(hammingDistance(3,1));
    }
}
