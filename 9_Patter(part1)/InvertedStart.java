import java.util.Scanner;
public class InvertedStart {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of invereted star you want : ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows - i + 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
