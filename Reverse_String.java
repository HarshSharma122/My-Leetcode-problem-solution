public class Reverse_String {
    public static void reverseString(char[] s)
    {
        int start = 0;
        int end = s.length-1;
        char temp;
        while (start<=end)
        {
            if (s[start]!= s[end])
            {
                temp = s[start];
                s[start]  = s[end];
                s[end] = temp;

            }
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        char [] har = {'H', 'A', 'R', 'S', 'H'};
        reverseString(har);
    }
}
