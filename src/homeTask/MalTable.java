package homeTask;

import java.util.Scanner;

public class MalTable {


    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Enter a positive number  ");
       int number=input.nextInt();

       for(int i=1; i<=10; i++) {
          int number1=number*i;
           System.out.println(number+"x"+i+"="+number1);
       }





    }


}
