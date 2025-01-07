public class TransposeOfMatrix {

  public static int[][] transposeOfMatrix(int[][] matrix) {
    // Transpose of a matrix is obtained by changing rows to columns and columns to rows.
    int[][] transpose = new int[matrix[0].length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        // Changing rows to columns and columns to rows.
        transpose[i][j] = matrix[j][i];
      }
    }
    return transpose;
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] transpose = transposeOfMatrix(matrix);
    for (int i = 0; i < transpose.length; i++) {
      for (int j = 0; j < transpose[0].length; j++) {
        System.out.print(transpose[i][j] + " ");
      }
      System.out.println();
    }
  }
}
