package homeTask;
import java.util.*;
public class FirstLetter {
    public static void main(String[] args) {


//Ask user to enter a word. If the work contains starts with x, print the word without x.

        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();


//          boolean check= n1.charAt(0)=='x';
//          if( check) {
//           System.out.println(n1.substring(1));
//          }else{ System.out.println("Invalid word.");
//        }

//
//      if (n1.indexOf("x")==0){
//          System.out.println(n1.substring(1));
//       }else{
//          System.out.println("Invalid name");
//      }


//        String n2=n1.substring(1);
//        if (n1.contains("x") && n1.startsWith("x")) {
//            System.out.println(n2);
//
//        }else{
//            System.out.println(n1);
//        }

        String n2 = n1.substring(0);
        String n3 = n1.substring(1);
        if(n2.contains("x")) {
            System.out.println(n3);
        } else {
            System.out.println(n1);
        }




    }

}













