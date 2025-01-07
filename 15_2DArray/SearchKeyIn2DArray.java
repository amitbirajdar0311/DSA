import java.util.Scanner;
public class SearchKeyIn2DArray {
    public static void valueSearch(int[][] matrix, int value){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == value){
                    System.out.println("Value found at index : "+i+" "+j);
                    return;
                }

            }

        }
        System.out.println("Value not found");
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int col = sc.nextInt();
        int[][] matrix =  new int[row][col];
        System.out.println("Enter elements of matrix : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){ 
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter value to search : ");
        int value = sc.nextInt();
        valueSearch(matrix, value);
        sc.close();
        
    }    
}
