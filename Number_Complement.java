public class Number_Complement {
    public static int findComplement(int n)
    {
      for (long i = 1; i<=n; i<<=1)
      {
          n ^= i;
      }
       return n;
    }
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}