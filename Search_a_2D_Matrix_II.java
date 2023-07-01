public class Search_a_2D_Matrix_II {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int rowIndex = 0;
        int colIndex = col - 1;
        while (row>= rowIndex && colIndex>=0)
        {
            if (matrix[rowIndex][colIndex] == target)
            {
                return true;
            } else if (matrix[rowIndex][colIndex]<target) {
                rowIndex++;
            }else
            {
                colIndex--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][]matrix = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}};
        System.out.println(searchMatrix(matrix, 5));
    }
}
