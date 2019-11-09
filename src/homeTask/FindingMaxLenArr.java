package homeTask;

import java.util.Arrays;
import java.util.Scanner;

public class FindingMaxLenArr {
    public static void main(String[] args) {
//Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length
//
//Example:
//words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
//prints jaaaaavvaaaaaaaaaa
        Scanner input=new Scanner(System.in);
        String [] word =new String[5];
        for (int i=0;i<word.length;i++) {
            word[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(word));
      String biggestWord="";
      int  biggestLength=0;
      for(String  elements: word){
          if(elements.length()>biggestLength){
              biggestLength=elements.length();
              biggestWord=elements;
          }

          }
          System.out.println(biggestWord);
      }






        }



