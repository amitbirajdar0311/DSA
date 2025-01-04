import java.util.Scanner;
public class AverageOfThreeNumbers{
    public static double averageCalculate(double num1, double num2, double num3){
        double average = (num1 + num2 + num3) / 3;
        return average;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the third number: ");
        double num3 = sc.nextDouble();
        
        double average = averageCalculate(num1, num2, num3);
        
        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);
        sc.close();
    }
}