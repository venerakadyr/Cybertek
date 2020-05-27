package mockInterview;

import java.util.Arrays;

public class ReverseTask {
    public  static String toReverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }


    public static boolean isPalindrom(String str) {
        boolean isPalindrom = false;
        String strToCheck = toReverse(str);
        System.out.println(strToCheck+"reversed vesrion");

        if (strToCheck.toLowerCase().equals(str)) {
            return isPalindrom=true;
        }
        return isPalindrom= false;

    }


    public static void main(String[] args) {

        System.out.println(isPalindrom("civic"));
//        FIRST VERSION=============================================================
//        GIVEN STRING  SENTECE REVERSE IRT
//        String str= "It started to snow in Chicago";
//        String [] words=str.split(" ");
//        String finalString="";
//
//        for (String word:words){
//            String rev="";
//            for(int i=word.length()-1;i>=0;i--){
//                rev+=word.charAt(i);
//            }
//            finalString+=rev+"";
//        }
//
//        System.out.println(finalString);
//    }
//       SECOND VERSION====================================================================
//         public static String reverseStringSwap(String s){
//        CREATE RETURN METHOD TO REVERSE THE STRING WITH STRING BUILDER;
//        return new StringBuilder(s).reverse().toString();
//
//         THIRD VERSION==============================================================
//         String word=input.nextLine();
//        String rev=" ";
//        for(int i= word.length()-1; i>=0; i--) {
////            i=word.length()-1=========it gonna start from the last letter (-1 )
////            i>=0 code is gonna run until it hit O-index(first letter====0 index is first letter of the word)
////            i-- dincrements semaj ====>s  dicrementing by one =====>
//            rev+=word.charAt(i);
////          rev+=word.charAT(i) is concat not assigning=====storing in one place
//
//        }
//        System.out.println(rev);
//        FOURTH VERSION ===============================================================
//         String word="We went to picnic today";
//      String [] rev =word.split(" ");
//      String reverse="";
//       for(String vvv: rev){
//           for(int j=vvv.length()-1; j<0;--j){
//               reverse+=vvv.charAt(j);
//               System.out.println(reverse);
//
//==================================================== REVERSE INT ARRAY

//        int[] number={1,2,3,4,5,6};
//
//        int temp=0;
//        for (int i=0; i<number.length/2;i++){
////            i need my loop iterate on;y half length because each iteration will be one swaping, if it full lenght
////            iteration will be 2 swaping and evryhing will be back where it started
//            temp=number[i];
//            number[i]=number[number.length-1-i];
////            storing last digit and - i
//            number[number.length-1-i]=temp;
//        }
//        System.out.println(Arrays.toString(number));
//
//    }


    }
}

