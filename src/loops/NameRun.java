package loops;

import java.util.Scanner;

public class NameRun {
    public static void main(String[] args) {


//        Scanner input=new Scanner(System.in);
//
//        System.out.println(" Enter your name");
//        String name=input.nextLine();
//
//        for(int i=0; i<15; i++){
//            System.out.println("Welcome,"+ name+i);
//        }
//        System.out.println();
//        for(int i=0; i<=name.length(); i++){
//            System.out.println(name.charAt(i)+" for index"+i);
//        }


//     Task      Write a program that asks from5 names from user and print it
//                   Scanner input=new Scanner(System.in);
//
//                   for (int i=0; i<5;i++) {
//                       System.out.println("Enter a name" + i);
//                        name=input.nextLine();
//                    System.out.println(name);

//                   }
//      Task Write a program that asks from the user  infinitely;
//        if user enters "Hi" your program answer "hello", if user enters "bey"
//         your program says " good bye"
//         > hi
//        Hello ect

        Scanner input = new Scanner(System.in);
        for (; ; ) {
            String user = input.nextLine();
            if (user.equalsIgnoreCase("hi")) {
                System.out.println("Hello");
            } else {
                System.out.println("Good bye");
                break;


            }


        }
    }
}