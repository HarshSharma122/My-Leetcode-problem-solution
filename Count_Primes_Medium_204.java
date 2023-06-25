import java.util.Vector;

public class Count_Primes_Medium_204 {
    public static int countPrimes(int n)
    {
      boolean[] ans = new boolean[n];
     int count  = 0 ;
     boolean flag = true;

     for (int i =2; i<n; i++)
     {
         if (ans[i] != flag)
         {
             count++;
             for (int j =2; i*j<n; j++)
             {
                 ans[i*j] = flag;
             }
         }
     }
    return count;
    }
    public static void main(String[] args) {
        System.out.println(countPrimes(100));
    }
}
