import java.util.Scanner;
public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.println("sum of first n natural number is : " + sum);
        sc.close();
    }
}
