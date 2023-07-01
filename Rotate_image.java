public class Rotate_image {
    public static void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i<row; i++)
        {
            for (int j =i; j<col; j++)
            {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i<row; i++)
        {
            for (int j = 0; j<col /2; j++)
            {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][col -1 -j];
                matrix[i][col -1 -j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotate(matrix);
    }
}
