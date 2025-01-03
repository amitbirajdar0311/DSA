import java.util.Scanner;
public class ProgramThatReadsSetOfIntegersAndPrintEvenSumAndOddSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int evensum = 0;
        int oddsum = 0;
        int choice;
        do{
            System.out.println("Enter a number : ");
            int number = sc.nextInt();
            if(number %2 ==0){
                evensum +=number;
            }
            else{
                oddsum +=number;
            }
            System.out.println("Do you want to continiue if Yes(1) or No(0)");
            choice = sc.nextInt();
            
            
        }while(choice==1);
        System.out.println("Even number's num is : " + evensum);
        System.out.println("Odd Number's sum is : " + oddsum);
        sc.close();
    }
}
