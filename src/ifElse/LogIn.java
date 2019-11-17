package ifElse;


import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String login = "vkadralieva";
        String password = "Kadralieva";

        System.out.println(" Enter you username:");
          String userName = input.nextLine();
          if (userName.equals(login)) {
              System.out.println("Enter you password:");
          }
        String passCode = input.nextLine();
               if (passCode.equals(password)){
                   System.out.println("Log in successfull");

               }
                   else {
                   System.out.println("Wrong password");

               }

          }








    }


