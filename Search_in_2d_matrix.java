public class Search_in_2d_matrix {
    public static boolean searchMatrix(int [][] matrix, int target) {
        int row = matrix.length; // get row length
        int col = matrix[0].length; // get col length
        int start = 0;
        int end = row * col - 1;
        int mid = start + (end - start) /2;
        while (start<=end)
        {
            int ans = matrix[mid / col] [mid % col];
            if (ans==target)
            {
                return true;
            }
            if (ans<target)
            {
                start = mid + 1;
            }else
            {
                end = mid  - 1;
            }
            mid = start + (end - start)  /2;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        System.out.println(searchMatrix(matrix, 3));
    }
}
