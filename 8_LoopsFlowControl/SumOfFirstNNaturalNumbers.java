import java.util.Scanner;
public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a last number till we have print sum from 1");
        int n = sc.nextInt();
        int counter = 1;
        int sum = 0; 
        while(counter <=n){
            sum+=counter;
            counter++;
        }
        System.out.println("Sum of 1st N Natural number is : " + sum);
        sc.close();
    }
}
