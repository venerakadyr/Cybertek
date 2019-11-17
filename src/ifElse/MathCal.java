package ifElse;


import java.util.Scanner;

public class MathCal {

    public static void main (String [] args ){


        Scanner input=new Scanner(System.in);

        System.out.println("Enter 2 diget number:");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        input.nextLine();
        System.out.println("Please choose operator:-,+,/,*");
        String operator=input.nextLine();


        if ( operator.equals("+")){
            System.out.println( "result:"+num1+"+"+num2 +"is: "+(num1+num2));
        } else if (operator.equals("-")) {
            System.out.println("result:" + num1+"-"+num2+"is: "+(num1-num2));
        }else if(operator.equals("*")) {
            System.out.println(" result:" + num1 +"*" + num2 + "is:"+(num1*num2));
        }else if (operator.equals("/")) {
            System.out.println( "result:"+ num1+"/"+num2+ "is: "+(num1/num2));
        }












    }

}
