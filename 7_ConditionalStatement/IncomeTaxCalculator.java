import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income to calculate Tax : ");
        int income = sc.nextInt();
        int tax = 0 ;
        if(income < 5_00_000){
            tax = 0;
            System.out.println("Tax is = " + tax);
        }
        else if(income >= 5_00_000 && income <=10_00_000){
            tax = (int)(income * 0.20);
            System.out.println("Tax is = " + tax);
        }
        else {
            tax = (int)(income* 0.30);
            System.out.println("Tax is = " + tax);
        }

        sc.close();
    }
}
