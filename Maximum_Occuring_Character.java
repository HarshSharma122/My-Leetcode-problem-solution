public class Maximum_Occuring_Character {
    public static char maximumoccuring(String line)
    {
        int[] arr = new int[26];
        for (int i= 0; i<line.length(); i++)
        {
            char ch = line.charAt(i);
            int number = 0;
            if (ch>='a' && ch<='z')

            {
                number = ch - 'a';
            }else
            {
                number = ch- 'A';
            }
            arr[number]++;
        }
        int maxi = -1;
        int ans = -1;
        for (int i = 0; i<26; i++)
        {
            if (maxi<arr[i])
            {
                ans = i;
                maxi= arr[i];
            }
        }
        char finalAnswer = (char) ('a'  + ans);
        return finalAnswer;
    }
    public static void main(String[] args) {
        System.out.println(maximumoccuring("testsample"));
    }
}
