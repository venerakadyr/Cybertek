package homeTask;

import java.util.Scanner;

public class IfXX {
    public static void main(String[] args) {

//Ask user to enter a word. If the first or second or both letter of the word is x, print the word without x(s).
// If x is the third letter it should be printed. If the first and second are x, both should be ignored.

//Input:
//xxode
//Output:
//ode
//Input:
//oxidex
//Output:
//oidex

        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();
//        int first = n1.indexOf("x");
//        int second = n1.indexOf("x");
//        int third = n1.indexOf("x");


        if (n1.startsWith("x") && n1.charAt(1)=='x') {
            System.out.println(n1.substring(2));

        } else if ( n1.startsWith("x")) {
                System.out.println(n1.substring(1));

            } else if (n1.charAt(1)=='x') {
            System.out.println(n1.substring(0, 1)+n1.substring(2));
        }
            }
        }




