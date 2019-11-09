package methods;

import java.util.Scanner;

public class ReverseReturn {
//    Create a method that will accept a String and will reverse your String. Return the reversed String.

    public static String reverseString(){
        Scanner input=new Scanner(System.in);
        String str1=input.nextLine().toLowerCase();
        String rev="";

       for(int i=str1.length()-1; i>=0;i--){

           rev+=str1.charAt(i);

        }
        return rev;
    }


    public static void main(String[] args) {
        System.out.println(reverseString());
    }











}
