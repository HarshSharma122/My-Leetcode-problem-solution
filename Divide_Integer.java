    public class Divide_Integer {
    public static int divides(int dividend, int divisors)
    {
        int sign = 1;
        if ((dividend>0 && divisors<0) || (dividend<0 && divisors>0))
        {
            sign = -1;
        }
        dividend = Math.abs(dividend);
        divisors = Math.abs(divisors);
        int quote = 0;
        while (dividend>=divisors)
        {
            dividend -= divisors;
            quote++;
        }
        return sign * quote;
    }

    public static void main(String[] args) {
//        System.out.println(-5/-2);
        System.out.println(divides(-5,-2));
    }

}
