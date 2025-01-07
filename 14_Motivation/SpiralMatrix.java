public class SpiralMatrix {
    public static void printSpiral(int[][] matrix){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //print top boundary : row is constant and column varies
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //print right boundary : column is constant and row varies  
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //print bottom boundary : row is constant and column varies
            for(int j=endCol-1; j>=startCol; j--){
                //check if startRow == endRow, then we have only one row left to print : top boundary = bottom boundary
                if(startRow == endRow) break;
                System.out.print(matrix[endRow][j]+" ");
            }
            //print left boundary : column is constant and row varies
             for(int i=endRow-1;i>startRow;i--){
                //check if startCol == endCol, then we have only one column left to print : left boundary = right boundary
                if(startCol == endCol) break;
                System.out.print(matrix[i][startCol]+" ");
             }
             startRow++;
             endRow--;
             startCol++;
             endCol--;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13,14,15,16}
        };
        printSpiral(matrix);
    }
}
