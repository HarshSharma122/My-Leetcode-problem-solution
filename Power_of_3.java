public class Power_of_3 {
    public static boolean power(int n)
    {
        if (n==0) return false;
        if (n==1) return true;


        if (n>1)
        {
            return n%3==0 && power(n/3);
        }else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(power(27));
    }
}
