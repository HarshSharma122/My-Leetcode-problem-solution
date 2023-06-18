import java.math.BigInteger;

public class Add_Binary_number {
    public static String addBinary(String a, String b)
    {
        BigInteger n1 = new BigInteger(a, 2);
        BigInteger n2 = new BigInteger(b, 2);
        BigInteger sum = n1.add(n2);
        return sum.toString(2);
    }
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));

    }
}
