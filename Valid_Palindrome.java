public class Valid_Palindrome {
    public static boolean isPalindrome(String s)
    {
        if (s.isEmpty()) // if s is blank then you should return true
        {
            return true;
        }
        String str = s.toLowerCase();
        // remove the non AlphaNumeric character like:- _, $, *
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder revStr = new StringBuilder(str);
        revStr.reverse();
        String rstr = revStr.toString();
        if(str.equals(rstr))
        {
            return true;

        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }
}
