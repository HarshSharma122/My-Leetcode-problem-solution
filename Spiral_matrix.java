import java.util.ArrayList;
import java.util.List;
public class Spiral_matrix {
    public static List<Integer> spiralOrder(int[][] matrix)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int srow = 0;
        int scol = 0;
        int erow = matrix.length - 1;
        int ecol = matrix[0].length - 1;
        while(srow<=erow && scol <= ecol)
        {
            for (int index = scol; index< ecol; index++)
            {
                ans.add(matrix[srow][index]);
            }
            for (int index = srow; index< erow; index++)
            {
                ans.add(matrix[index][ecol]);
            }
            for (int index = ecol; index>scol; index--)
            {
                ans.add(matrix[erow][index]);
            }
            for (int index = erow; index>srow; index--)
            {
                ans.add(matrix[index][scol]);
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }
        if (matrix.length == matrix[0].length && matrix.length%2!=0)
        {
            int mid = matrix.length / 2;
            ans.add(matrix[mid][mid]);
        }
        while (ans.size()!= matrix.length * matrix[0].length)
        {
            ans.remove(ans.size() - 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3}, { 4, 5, 6}, { 7, 8, 9 } };
        System.out.println(spiralOrder(matrix));
    }
}