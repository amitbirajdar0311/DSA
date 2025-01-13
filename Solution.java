public class Solution {

  public static int power(int a, int n){
    if(n==0){
      return 1;
    }
    int halfPower = power(a,n/2);
    if(n%2!=0){
        return a * halfPower * halfPower;
    }
    return halfPower * halfPower;
  }
  public static void main(String[] args) {
    int a = 2 ;
    int n = 5 ;
    int result = power(a, n);
    System.out.println(result);
  }
}
