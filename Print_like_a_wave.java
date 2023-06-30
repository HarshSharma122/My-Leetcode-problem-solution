import java.util.ArrayList;

public class Print_like_a_wave {
    public static int[] wavePrint(int[][] arr, int nrow, int mcol)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int col = 0; col<mcol; col++)
        {
            // odd index -->> bottom to top
            if ((col%2!=0) || (col&1)!=0)
            {
                for (int row = nrow-1; row>=0; row--) 
                {
                    ans.add(arr[row][col]);
                }
            }
            else
            // even index --->> top to bottom
            {
                for (int row = 0; row<nrow; row++)
                {
                    ans.add(arr[row][col]);
                }
            }
        }
        int[] arr1 =  ans.stream().mapToInt(i->i).toArray();
        return arr1;

    }
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        System.out.println(wavePrint(arr, 3, 4));
    }
}
