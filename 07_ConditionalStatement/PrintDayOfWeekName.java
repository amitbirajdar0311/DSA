import java.util.Scanner;

public class PrintDayOfWeekName {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number corresponds to day");
    int num = sc.nextInt();
    switch (num) {
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wensday");
        break;
      case 5:
        System.out.println("Thursday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Satarday");
        break;
      default:
        System.out.println("Invalid day of week");
    }
    sc.close();
  }
}
