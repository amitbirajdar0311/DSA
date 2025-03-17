import java.util.Scanner;
public class PrintEvenNumbersBetweenAAndB {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        for(int i=num1;i<num2;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        sc.close();

    }
}
