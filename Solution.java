public class Solution{
  public static void removeDuplicates(String str){
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
      // Check if the current character is not already present in newStr
      if (newStr.indexOf(str.charAt(i)) == -1) {
        newStr += str.charAt(i); 
      }
    }
    System.out.println(newStr);
  }
  public static void main(String[] args){
   String str = "appnnacollege";
   removeDuplicates(str);
  }
}