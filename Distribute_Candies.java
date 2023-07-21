import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Distribute_Candies {
    public static int distributeCandies(int[] candyType)
    {
        Set<Integer> candy = new HashSet<>();
        for (int e:candyType)
        {
            candy.add(e);
        }
        return Math.min(candyType.length/2, candy.size());
    }
    public static void main(String[] args) {
        int[] nums = {1,11};
        System.out.println(distributeCandies(nums));
    }
}
