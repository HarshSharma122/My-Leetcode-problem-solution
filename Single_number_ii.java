import java.util.Arrays;
public class Single_number_ii {
    public static int singleNumber(int[] nums)
    {
       int res = 0;
       int ans = 0;
       for (int num:nums)
       {
           res  = (res ^ num) & ~ans;
           ans = (ans ^ num) & ~ res;

       }
       return res;
    }
    public static void main(String[] args) {
        int[] nums ={3,5,1,3,1,3,1};
        System.out.println(singleNumber(nums));
    }
}
