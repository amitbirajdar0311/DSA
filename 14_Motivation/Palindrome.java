class Palindrome {

  // Brute force approach
  public static boolean checkPalindromeByBruteForce(String str) {
    String str1 = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      str1 += str.charAt(i);
    }
    return str1.equals(str);
  }

  // Optimized approach
  public static boolean checkPalindrome(String str) {
    int start = 0;
    int end = str.length() - 1;
    while (start < end) {
      if (str.charAt(start) != str.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "madam";

    // if(checkPalindromeByBruteForce(str)){
    //     System.out.println("Given string is palindrome");
    // }
    // else{
    //     System.out.println("Not a palindrome");
    // }

    if (checkPalindrome(str)) {
      System.out.println("Given string is palindrome");
    } else {
      System.out.println("Not a palindrome");
    }
  }
}
