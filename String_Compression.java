public class String_Compression {
    public static int compress(char[] chars)
    {
         int i= 0;
         int ansIndex = 0;
         int n = chars.length;
         while (i<n)
         {
             int j = i + 1;

             while (j<n && chars[i]==chars[j])
             {
                 j++;
             }
             chars[ansIndex++] = chars[i];

             int count = j - i;
             if (count>1)
             {
                 String std = Integer.toString(count);


                 for (char ch : std.toCharArray())
                 {
                     chars[ansIndex++] = ch;
                 }
             }
             i=j;
         }
         return ansIndex;
    }
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
}