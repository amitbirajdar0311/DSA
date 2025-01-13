public class PrintApowerN {

  public static int power(int a, int n) {
    if (n == 0) {
      return 1;
    }
    return a * power(a, n - 1);
  }

  //optimal way
  public static int powerOptimal(int a, int n) {
    //base case should be same as above
    if (n == 0) {
      return 1;
    }
    int power = powerOptimal(a, n / 2);
    if (n % 2 != 0) {
      return power * a;
    }

    return power;
  }

  public static void main(String[] args) {
    int a = 2;
    int n = 5;
    System.out.println(power(a, n));
  }
}
