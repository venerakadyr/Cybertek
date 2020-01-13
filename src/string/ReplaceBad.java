package string;

import java.util.Scanner;

public class ReplaceBad {
//       public static int secondLargestNum(int[] arr) {
//           int temp;
//           for (int i = 0; i <= arr.length - 1; i++) {
//               for (int j = 1; j <= arr.length - 1; j++) {
//                   if (arr[j] < arr[j - 1]) {
//                       temp = arr[j - 1];
//                       arr[j - 1] = arr[j];
//                       arr[j] = temp;
//                   }
//               }
//           }
//           int secondMax = 0;
//           for (int i = arr.length - 1; i >= 0; i--) {
//               if (arr[i] != arr[i - 1]) {
//                   secondMax = arr[i - 1];
//                   break;
//
//               }
//           }
//           return  secondMax;
//       }
//


    public static boolean isAnagram(String word1, String  word2){
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        int count = 0;
        boolean check = true;
        if (word1.length()== word2.length()) {
            for (int i = 0; i <= word1.length()-1; i++){
                for( int j = 0; j <= word1.length()-1; j++) {
                    if (word1.charAt(i) == word2.charAt(j)) {
                        count ++;
                    }
                }
            }if (count == word1.length()) {
                check = true;
            }else {
                check = false;
            }
        } else {
            check = false;
        }
        return check;
    }

    public static void main(String[] args) {
        String word1="listen";
        String word2="silent";
        System.out.println(isAnagram(word1,word2));
    }
//User is asked to enter a message to send. You will check if the message contains any of these bad words:
// “idiot, dumb, stupid”> if any bad words are in the message change them to “smart” and print “your message was changed:”
// and then print the new message in the next line.> if the message had no bad words print
// “Your message was not changed:” and then print the original message in the next line
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter a message");
//         String message=input.nextLine();
//         String checked=message;
//         checked=message.replace("idiot", "smart");
//         checked=message.replace("dumb", "smart");
//         checked=message.replace("stupid","smart");
//
//
//
//        if(message.equalsIgnoreCase(checked)) {
//            System.out.println("Your message was not changed");
//            System.out.println(message);
//        } else {
//            System.out.println("Your bad words were removed");
//            System.out.println(checked);

//         }
//        String text = "bla bla fee";
//        String badWord = "fee";
//
//        System.out.println(clean(text, badWord));
//
//    }
//
//    public static String clean(String text, String badWord) {
//
//        if (text.contains(badWord)) {
//        }
//        return  text.replace(badWord, "");
//        String check = "nurses run";
//        System.out.println(isPalindrome(check));
//
//    }
//
//    public static boolean isPalindrome(String check) {
//
//        check=check.replace(" ","");
//        String rev = "";
//        for (int i = check.length() - 1; i >= 0; i--) {
//            rev += check.charAt(i);
//
//        }
//
//        if (rev.equalsIgnoreCase(check)) {
//            return true;
//        }
//        return false;






    }
