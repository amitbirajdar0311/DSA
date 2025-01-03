import java.util.Scanner;

public class CalculateSimpleInterest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the principal amount: ");
    double principal = sc.nextDouble();
    System.out.println("Enter the rate of interest: ");
    double rate = sc.nextDouble();
    System.out.println("Enter the time period in years: ");
    double time = sc.nextDouble();
    double simpleInterest = (principal * rate * time) / 100;
    System.out.println("The simple interest is: " + simpleInterest);
    sc.close(); 
  }
}
