package testPractice;

import java.util.ArrayList;
import java.util.List;

public class PalindromeWithSB {
    //FIRST APPROACH
    public static String  findTheBiggestPalindrome(List<String> lists) {

        String palindrom = lists.get(0);
        for (String each : lists) {
            StringBuilder sb = new StringBuilder(each);
            String str = sb.reverse().toString();

            if (str.equalsIgnoreCase(each)) {
                if (palindrom.length() < str.length()) {
                    palindrom = str;
                }
            }


        }
        return palindrom;



    }
//SECOND APPROACH
    public static String biggestPalindrome2 (ArrayList<String> words) {
        String palindrome = "";
        outer:  for(String word: words) {
            for(int i=0; i < word.length()/2; i++) {
                if(word.charAt(i) != word.charAt(word.length()-1 - i)) {
                    continue outer;
                }
            }
            if(word.length() > palindrome.length()) {
                palindrome = word;
            }
        }
        return palindrome;
    }

    //THIRD APPROACH
    public static String biggestPalindrome (ArrayList<String> words) {
        String palindrome = "";
        for(String word: words) {
            if(isPalindrome(word) && word.length() > palindrome.length()){
                palindrome = word;
            }
        }
        return palindrome;
    }
    static boolean isPalindrome(String word) {
        return new StringBuilder(word).reverse().toString().equals(word);
    }




    public static void main(String[] args) {
        //TASK2
        List<String> lists=new ArrayList<>();
        lists.add("civic");
        lists.add("abbbbccbbbba");
        lists.add("dfgiudsgfidugiufdiudfg");
        lists.add("hhweuyhd");


        System.out.println(findTheBiggestPalindrome(lists));


    }
}