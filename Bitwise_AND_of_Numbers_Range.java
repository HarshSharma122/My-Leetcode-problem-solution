public class Bitwise_AND_of_Numbers_Range {
    public static int rangeBitwiseAnd(int left, int right) {
        for (int i = right-1; i>=left; i--)
        {
            right &= i;
            i= right;
        }
        return right;
    }
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5,7));
    }
}
