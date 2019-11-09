package string;

import java.util.Scanner;

public class PerfectAb {
    public static void main(String[] args) {
//Given an String, n , perform the following conditional actions:
//If  n contains a and length less than 5, print A Perfect,
//If n contains b, a and length between 7 and 10 (both inclusive) print B Perfect, if not between range and not included a then print Perfect, if a included and not between the range, print empty (System.out.println("");
//If none of them the print Sorry
        System.out.println("Please enter:");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        boolean a=n.contains("a");
        boolean b=n.contains("b");
        boolean length7=n.length()>7;
        boolean length10=n.length()<10;


        if (a && b && length7 && length10) {
            System.out.println("B Perfect");

        }else if (a && n.length() < 5) {
            System.out.println("A Perfect");
        } else if (a ) {
            System.out.println(" ");
        }
        else if (b ) {
            System.out.println("Perfect");
        } else{
            System.out.println("Sorry");



        }
    }

}






