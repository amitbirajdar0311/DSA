import java.util.*;

public class NumberIsPositiveOrNegative {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check it is positive or negative: ");
    int number = sc.nextInt();
    if (number > 0) {
      System.out.println("given number is positive");
    } else if (number == 0) {
      System.out.println("Given number is either positive nor negative");
    } else {
      System.out.println("Given number is negative");
    }
    sc.close();
  }
}
