public class Number_of_Steps_to_Reduce_a_Number_to_Zero_1342 {
    public static int numberofSteps(int n)
    {
        if (n==0)
        {
            return n;
        }
       return 1+(n%2==0 ? numberofSteps(n/2) : numberofSteps(n-1));
    }
    public static void main(String[] args) {
        System.out.println(numberofSteps(14));

    }
}
