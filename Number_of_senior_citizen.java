public class Number_of_senior_citizen {
    public static int senior(String[]nums)
    {
       int count = 0;
       for (String ans: nums)
       {
           int s1 = ans.charAt(11) - '0';
           int s2 = ans.charAt(12) - '0';

           if ((s1*10) + s2>60)
           {
               count++;
           }
       }
       return count;
    }
    public static void main(String[] args) {
        String[]nums = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(senior(nums));

    }
}
