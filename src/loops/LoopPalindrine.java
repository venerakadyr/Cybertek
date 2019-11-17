package loops;

import java.util.Arrays;

public class LoopPalindrine {
    public static void main(String [] args) {

//[IQ] Palindrome: A word that is the same read forwards and backwards. User takes a word from the console.
// Print true if the word is a palindrome. Print false if the word is not palindrome.
//                > input: civiv
//                > output: true

//        Scanner input =  new Scanner(System.in);
//        String word = input.nextLine();
//        String back = "";
//        for(int i = word.length()-1; i >= 0; i--) {
//            back += word.charAt(i);
//        }
//        System.out.println(word);
//        System.out.println(back);
//        if(word.equals(back)) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not Palindrome");
//        }
//


//        Scanner input = new Scanner(System.in);
//        String word = input.nextLine();
//        String checked = "";
//        for(int i=0; i < word.length(); i++) {
//            int count = 0;
//            if(!checked.contains(word.charAt(i) + "")) {
//                for (int j = 0; j < word.length(); j++) {
//                    if (word.charAt(i) == word.charAt(j)) {
//                        count++;
//                    }
//                }
//                checked += word.charAt(i) + " ";
//                System.out.println(word + " has " + count + " "  + word.charAt(i));
//            }


        int[] number = {6,4,4,5,6,5,8,8,3};
        Arrays.sort(number);
        int singleNum=0;
        for (int i = 0; i <= number.length-1; i++) {
            if (i == number.length - 1 && number[number.length - 1] != number[number.length - 2]) {
           singleNum=number[number.length-1];
            } else if (i ==0 && number[0] != number[1]) {
                singleNum=number[0];
            } else if (i >0 && i < number.length - 1) {
                if (number[i] != number[i + 1] && number[i] != number[i - 1]) {
               singleNum=number[i];
                }

            }
        }
        System.out.println(singleNum);
    }




    }

