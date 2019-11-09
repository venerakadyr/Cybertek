package methods;

import javax.accessibility.AccessibleKeyBinding;

public class MethodTask {
    public static void main(String[] args) {


    }
//    Create a method that will accept two Strings.
//    Return a new String that has the firstWord then the secondWord and then the firstWord again
//> input: “day”, “name”
//> output: “daynameday”
//Overload the method above to now accept the two Strings and an integer.
// The integer given tells you how many times your first word should show up in your new String.
// Your first words need to always be separated by the second word.
// > input: “day”, “name”, 3
//> output: “daynamedaynameday”

    public static String firstAndSecondWord(String str1, String str2){
//      String result=str1+str2+str1;
//      return result;
        return str1+str2+str1;
//         System.out.println(firstAndSecondWord("day", "name"));   calling the method on main

    }
    public static String firstAndSecondWord(String str1,String str2, int count){
         String word="";
             if(count<=0) {
                 return "";
             }
             for(int i=0; i<count; i++){
                 word+=str1;
//                 if(i==count-1){
//                     break;
//                 }     if statement  break the last iteration right before printing str1 but not str2
                 word+=str2;
             }
                 return word.substring(0,word.length()-str2.length());
//              we have to substring  the last night
//         System.out.println(firstAndSecondWord("day", "name",5));    calling the method.

         }
//Create a method that will accept two Strings. Return true if the first string begins with the second String.
// Return false if it does not.
//Overload the method to accept a two Strings and a number. Return true if the second
// String is found inside of your first String the amount of times equal to your number parameter.
//input: “jamesjajl”,”ja", 2
//output: true

public static boolean checkingSecondString(String first, String second) {
        return first.toLowerCase().startsWith(second.toLowerCase());

        }
    public static boolean checkString(String word, String start, int times) {
        int count = 0;
        for(int i=0; i < word.length() - start.length() + 1 ; i++) {
            String sub = word.substring(i, i + start.length());
            //   System.out.println(sub);
            if(sub.equals(start)) {
                count++;
            }
        }
        if(times == count) return true;
        return false;



            }
//  Create a method that will accept an int array. Add up all the numbers in your array, except for numbers that end with 5.
//Overload your method to take an int array and a number.
// Now return the sum of all the numbers, except for the numbers that end with the given number.

        }

