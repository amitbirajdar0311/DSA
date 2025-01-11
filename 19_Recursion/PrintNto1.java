public class PrintNto1 {

  public static void printNto1(int n) {
    //Base Case
    if (n == 1) {
      System.out.print(n);
      return;
    }
    System.out.print(n + " ");
    printNto1(n - 1);
    return;
  }

  public static void main(String[] args) {
    int n = 10;
    printNto1(n);
  }
}
