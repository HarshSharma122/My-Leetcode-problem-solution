import java.util.Arrays;

public class Distribute_Candies {
    public static int distributeCandies(int[] candyType)
    {
        Arrays.sort(candyType);
        int count = 1;
        int n =candyType.length;
        if (n%2!=0){
            return 0;
        }
       if (n%2==0)
       {
           for(int i = 0; i<candyType.length-1; i++)
           {
               if (candyType[i]!=candyType[i+1])
               {
                   count++;
               }
           }
           int ans = n/2;
           if (ans>count)
           {
               return count;
           }else if (ans<count)
           {
               return ans;
           }
       }
       return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3};
        System.out.println(distributeCandies(nums));
    }
}
