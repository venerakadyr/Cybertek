package hackerRank;

import java.util.Scanner;

public class ProblemSolving {
    private static void printRowOutlined(String left, int right) {
        System.out.printf("%-15s", left);
        System.out.printf("%03d\n", right);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            printRowOutlined(s1, x);
        }


        System.out.println("================================");
//        int n=4;
//
//        if(n%2==1){
//            System.out.println("Weird1");
//        }
//
//        if(n%2==0&&n>=2&&n<=5){
//            System.out.println("Not Weird2");
//        }
//        if(n%2==0&&n>=6&&n<=20){
//            System.out.println("Weird3");
//        }
//        if(n%2==0&&n>20){
//            System.out.println("Not Weird4");
//        }
    }



            }





