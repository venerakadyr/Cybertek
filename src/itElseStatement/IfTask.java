package itElseStatement;



import java.util.Scanner;

public class IfTask {

    public static void main(String[] args) {
         Scanner input=new Scanner (System.in);

        System.out.println( "Enter any 5 number:");
//        int number1=input.nextInt();


//        if (number % 2 == 0) {
//            System.out.println("EVEN");
//        }else {
//            System.out.println("ODD");





        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int num4=input.nextInt();
        int num5=input.nextInt();

        int odds=0;
        int evens=0;


        if (num1%2==0){
            evens++;
        }else {
            odds++;
        }
            if (num2%2==0){
                evens++;
            }else {
                odds++;
            }
        if (num3%2==0){
            evens++;
        }else {
            odds++;
        }
        if (num4%2==0){
            evens++;
        }else {
            odds++;
        }
        if (num5%2==0){
            evens++;
        }else{
            odds++;
        }

        System.out.println("The total of odds:" +odds);
        System.out.println("The total of evens:"+ evens);








    }
}
