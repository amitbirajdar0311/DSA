public class RemoveDuplicateFromString{
    public static String removeDuplicateFromString(String str){
        String str1 = ""; 
        for(int i=0;i<str.length();i++){
            if(i<str.length() && str1.indexOf(str.charAt(i)) ==-1){
                str1+=str.charAt(i);
            }
        }
        return str1;
    }

    //using recursion 
    public  static void removeDuplicateFromStringUsingRecursion(String str, int index , StringBuilder sb , boolean[] map){
        //base case 
        if(index == str.length()){
            System.out.println(sb);
            return;
        }

        //kam 
        char currentChar = str.charAt(index);
        if(map[currentChar-'a'] == true){
            //duplicate 
            removeDuplicateFromStringUsingRecursion(str,index+1,sb,map);
        }
        else{
            //not present in map tho add kro map mai 
            map[currentChar-'a'] = true;
            removeDuplicateFromStringUsingRecursion(str, index+1, sb.append(currentChar), map);
        }



    }
    public static void main(String[] args){
        String str = "appnnac";
        // String str1 = removeDuplicateFromString(str);
        // System.out.println(str1);
        removeDuplicateFromStringUsingRecursion(str,0, new StringBuilder(""), new boolean[26]);
    }
}