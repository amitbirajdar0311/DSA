public class PrintSumOfNumbersIn2ndRow {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        int sum = 0;
        //row is constant and column is changing : row =1 and column = 0,1,2
        for(int col=0;col<matrix[0].length;col++){
            sum += matrix[1][col];
        }
        System.out.println(sum);
        
    }
}
