package scanners;



import java.util.Scanner;

public class Apples {
    public static void main(String[] args) {
//Task 1:
// Choose a 5-digit number of apples that you have. You decided to give them away to your Cybertek class.
//There are 70 females and 30 males in your class. Each female in your class got 85 apples. Each male in your class got 45 apples.
//The rest of your apples you gave to the staff of Cybertek.
//How many apples did the staff get?
//—>This is what I got:
//Choose a 5-digit number!
//12345
//The staff of Cybertek got 5045 apples.
//
// */
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Karina's apples");
//        int apples = input.nextInt();
//        int female = 70*85;
//        int male = 30*45;
//        int total = female + male;
//        int cybertek = apples - total;
//        System.out.println("Cybertek staff got: " + cybertek + " apples");

        Scanner input=new Scanner(System.in);


        System.out.println( "How many apples :");
        int apples=input.nextInt();
        System.out.println(" How many fems ?");
        int fems=input.nextInt();
        System.out.println("How many apples for fems?");
        int femApp= input.nextInt();
        System.out.println("How many male?");
        int males=input.nextInt();
        System.out.println("How many apples for males?");
        int maleApp=input.nextInt();
        int result=(fems*femApp)+(males*maleApp);
        int result2=apples-result;
        System.out.println( "Cybertek staff got " +result2 +" apples .");

    }
}
