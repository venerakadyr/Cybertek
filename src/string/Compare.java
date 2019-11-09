package string;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        5) User takes two strings from the user.
//        Compare the Strings and print out the String that comes first lexicographically

        System.out.println("Enter the first word:");
         String first=input.nextLine();
        System.out.println("Enter the second:");
         String second=input.nextLine();
//        System.out.println(first.compareTo(second));  ---> 1 version
         int compare= (first.compareTo(second));
        if (compare<0) {
            System.out.println(first);
        }else if (compare>0) {
            System.out.println(second);
        } else{
            System.out.println("equal");
        }


    }
}
