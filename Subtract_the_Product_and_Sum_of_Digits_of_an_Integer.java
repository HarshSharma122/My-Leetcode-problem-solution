public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static int substractandProductSum(int n)
    {
        int pro = 1;
        int sum = 0;
        while (n!=0)
        {
            int digit = n%10;
            pro = pro * digit;
            sum = sum + digit;
            n = n/10;
        }
        int result = pro - sum;
        return result;

    }
    public static void main(String[] args) {
        System.out.println(substractandProductSum(234));
    }
}
