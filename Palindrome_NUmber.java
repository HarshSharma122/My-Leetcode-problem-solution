public class Palindrome_NUmber {
    public static boolean isPalindrome(int x) {
        int res =0;
        int ss = x;
        if(ss<0)
        {
            return false;
        }
        while (x!=0)
        {
            int result = x%10;
            res = (res*10) + result;
            x = x/10;

        }
        if (res == ss)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-101));
    }
}
