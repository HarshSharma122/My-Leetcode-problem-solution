import java.lang.reflect.Type;

public class Binary_Number_with_Alternating_Bits_693 {
    public static boolean hasAlternatingBits(int n)
    {
        // Simple and best solution
        String ans = Integer.toBinaryString(n);
        for (int i = 0; i<ans.length()-1; i++)
        {
            if (ans.charAt(i)==ans.charAt(i+1))
            {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(11)); // 1011
        //0000000001011

        //0000000000101
    }
}
