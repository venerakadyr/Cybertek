package mockInterview;

public class IsPalindrome {
    public static boolean isPalindromeBetterOne(String s) {
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;


    }

    public static boolean isPalindrome(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i > 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome1(String str) {
        int start = 0;
        int end = str.length() - 1;
 while(start>end){
     if(str.charAt(start)!=str.charAt(end)){
         return false;
     }
     start++;
     end--;
 }
  return true;
    }
}