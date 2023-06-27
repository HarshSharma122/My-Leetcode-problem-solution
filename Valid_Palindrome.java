public class Valid_Palindrome {
    public static boolean isPalindrome(String s)
    {
        // first check the string is empty or not
        if (s.isEmpty())
        {
            return true;
        }
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder revstr = new StringBuilder();
        revstr.reverse();
        String rev = revstr.toString();
        if (s.equals(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
