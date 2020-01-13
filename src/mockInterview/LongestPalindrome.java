package mockInterview;

public class LongestPalindrome {
    public static void longestPalindrome(String [] str){

        String strLongestPalindrome= "";
         for (String element:str) {
            String reversed = "";
            for (int i = element.length()-1; i >=0 ; i--) {
                reversed+=element.charAt(i);
            }
            if(reversed.equals(element)){
                if(element.length() > strLongestPalindrome.length()) {
                    strLongestPalindrome=element;
                }
            }
        }
        System.out.println(strLongestPalindrome);
    }

    public static void main(String[] args) {
        String [] str={"hdfg","civic", "noon"};
       longestPalindrome(str);
    }
}










