package loops;

import java.util.Scanner;

public class NestedMalTab {
    public static void main(String[] args) {


//        for( int i=1; i<=10; i++){
//
//            System.out.println(i);
//
//         for(int j=1;j<=10;j++){
//             System.out.println(i+" x "+j+ "="+ (i*j));
//         }
//            System.out.println();
//


//
//        for(int i=0; i<=10; i++){
//            for(int j=0; j<=10; j++){
//                System.out.println(i+ " x "+ " = "+(i*j));
//
//            }
//            System.out.println("__________________");
//
//        }

//Write a program to find the factorial value of any number entered through the keyboard.
//
//
//Example:
//
//Input:
//5
//Output:
//Factorial: 120
//         // System.out.println("enter ");
//       int num = input.nextInt();
//        int sum=1;
//        for( int i=1; i<=num;i++) {
//                sum=sum*i;
//
//
//       }
//
//        System.out.print("Factorial:" +sum);
//
//
//
//
//        Two numbers are entered through the keyboard. Write a program to find the value of one number raised
//        to the power of another. (Do not use Java built-in method)
//
//        Example:
//
//        Input:
//        2
//        3
//
//        Output:
//        8

//
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter 1;");
//        int num1 = input.nextInt();
//        System.out.println("enter 2:");
//        int num2 = input.nextInt();
//        int mult = 1;
//        for (int i = 1; i <= num2; i++) {
//            mult*= num1;
//
//        }
//
//        System.out.println(mult);


////
//        Write a program that prompts the user to input an integer and then outputs
//        the number with the digits reversed. For example, if the input is 12345, the output should be 54321
//
//        Example:
//
//        Input:
//        899976545
//        Output:
//        Reverse of 899976545 is 545679998
//

////
//        Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
//        Ask for the first guest name.
//        Then ask does user want to enter one more guest.
//        If yes - take input from.
//        If not - finish the program and print list of the guests.
//
//        Example of the program:
//
//        Please enter guest name:
//        Nick
//        Do you want to enter new guest name:
//        yes
//        Please enter guest name:
//        Linda
//        Do you want to enter new guest name:
//        no
//
//        Guest's list: Nick, Linda


//
//          switch (answer){
//              case "yes":
//
//                  System.out.println("Enter a new name");
//                  String name2=input.nextLine();
//                  list+=name2;
//
//                  break;
//              case  "no":
//                      System.out.println(list);


        Scanner input = new Scanner(System.in);
        String list = "";
        String answer = " ";

        do {
            System.out.println("Enter a first name");
            String name = input.nextLine();
            list += name + ", ";
            System.out.println("Would you like to enter a new guest");
            answer = input.nextLine();
        }
        while (answer.equals("yes"));


        System.out.println("Guest list:" + list.substring(0, list.length() - 2));
    }
//        }

//
//         Scanner input=new Scanner(System.in);
//       long number =input.nextInt();
//        String num= number+"  ";
//
//        String rev=" ";
//        for(int i=num.length()-1;i>=(-0);i--) {
//            rev += num.charAt(i);
//        }
//
//        System.out.println("Reverse of "+number +" is " + rev);
//
//
//    }
//}


}








