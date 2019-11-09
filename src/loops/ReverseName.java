package loops;

import java.util.Scanner;

public class ReverseName {

    public static void main(String[] args) {

//      String word="Cybertek";


//      for(int i=0; i <word.length(); i++) {
//          System.out.println( word.charAt(i)+ ""+i);
//      }
////        C0
////        y1
////        b2
////        e3
////        r4
////        t5
////        e6
////        k7




Scanner input=new Scanner(System.in);

        System.out.println("Enter a word");
        String word=input.nextLine();
        String rev=" ";
        for(int i= word.length()-1; i>=0; i--) {
//            i=word.length()-1=========it gonna start from the last letter (-1 )
//            i>=0 code is gonna run until it hit O-index(first letter====0 index is first letter of the word)
//            i-- dincrements semaj ====>s  dicrementing by one =====>
            rev+=word.charAt(i);
//          rev+=word.charAT(i) is concat not assigning=====storing in one place

        }
        System.out.println(rev);










    }

}




