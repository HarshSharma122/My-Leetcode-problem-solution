public class Number_of_senior_citizen {
    public static int senior(String[]nums)
    {
        int count = 0;
        for (String s:nums)
        {
            int a = s.charAt(11);

            if (a>6)
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
