import java.util.Scanner;

public class PrintNumbersFrom1ToN {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number till we have to print from 1");
    int n = sc.nextInt();
    int counter = 1;
    while (counter <= n) {
      System.out.print(counter + " ");
      counter++;
    }
    System.out.println();
    sc.close();
  }
}
