package arr;

public class SplitArr {
    public static void main(String[] args) {
//        Given the String:
//"Write a program that creates a group of given size thisisabigword”
//Find the biggest word in your String and print it.
        String str=" Write a program that creates a group of given size thisisabigword";
        String [] arr=str.split(" ");

        int biggestLength = 0;
        String biggestWord = "";
        for(String word : arr) {
            if(word.length() > biggestLength) {
                biggestLength = word.length();
                biggestWord = word;
            }
        }
        System.out.println(biggestWord);
//        for(String word: arr) {
//            if(word.length() == biggestLength) {
//                System.out.println(word);
           }
      }





