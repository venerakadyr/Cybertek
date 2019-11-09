package methods;

public class NumberOfWordVoid {
    public static void main(String[] args) {



        countWord("The whole world");
    }


    public static void countWord(String sentence){

//  Create a void method name countWords that will accept a String as an argument. Print the following:
//“The number of words in the sentence is: numberOfWords”

     String []  numberOfWords= sentence.trim().split("");
     System.out.println("The number of words in the sentence is: "+ numberOfWords.length);

      }
    }

