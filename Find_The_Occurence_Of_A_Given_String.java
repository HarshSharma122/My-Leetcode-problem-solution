public class Find_The_Occurence_Of_A_Given_String {
    public static char getMaxOccuringChar(String line)
    {
        int []arr = new int[26];
        // create an array of count of character
        for (int i =0; i<line.length(); i++)
        {
            char ch = line.charAt(i);
            int number = 0;
            if (ch>='a' && ch<= 'z')
            {
                number = ch - 'a';
            }else
            {
                number = ch - 'A';
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
                maxi = arr[i];
            }
        }
        char finalAns = (char) ('a' + ans);
        return finalAns;
    }
    public static void main(String[] args) {
        System.out.println(getMaxOccuringChar("testsample"));
    }
}
