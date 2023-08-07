public class Say_Digits {
    static void sayDigits(int n, String arr[])
    {
        if (n==0)
        {
            return;
        }
        int digits = n %10;
        n = n / 10;
        // recursive call
        sayDigits(n, arr);
        System.out.println(arr[digits]);
    }
    public static void main(String[] args) {
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        sayDigits(413, arr);
    }
}
