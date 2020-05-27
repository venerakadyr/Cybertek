package mockInterview;

import java.util.Arrays;

public class FibonacciNumber {

//    public static String allFibonacciInRange(int range) {
//
//        int [] arr = new int[range];
//
//        arr[0] = 0;
//        arr[1] = 1;
//
//        for(int i = 2; i < arr.length; i++) {
//
//            arr[i] = arr[i-1] + arr[i-2];
//        }
//
//        String str = Arrays.toString(arr);
//        return str.substring(1,str.length()-1).replace(",","");
//
//
//    }

    public static String fibonacciNumber(int number) {
//

        String str = "";
        int Number1 = 0;
        int Number2 = 1;
        for (int i = 1; i <= number; ++i) {
            str += Number1 + "-";
            int sum = Number1 + Number2;
            Number1 = Number2;
            Number2 = sum;
        }
        return str.substring(0, str.length() - 1);
    }
//    }========================Version Two===================================================================================
//

    public static String allFibonacciInRange(int range) {

        int [] arr = new int[range];

    arr[0] = 0;
    arr[1] = 1;

        for(int i = 2; i < arr.length; i++) {


        arr[i] = arr[i-1] + arr[i-2];
    }

    String str = Arrays.toString(arr);
        return str.substring(1,str.length()-1).replace(",","");

//=====================Version Three===============================================================
}

public static String fbNum(int num) {
    String fib = "0 1 ";
    int num1 = 0;
    int num2 = 1;
    for (int i = 2; i < num; i++) {

    int sum = num1 + num2;
    num1 = num2;
    num2 = sum;


    fib += sum + " ";
}
       return fib;
}

    public static void main(String[] args) {

        //011235813
        int range=15;
         int number1=0;
         int number2=1;
         int sum=0;
         String f= number1+"_"+number2;


   for( int i=1; i<range; i++){

       sum=number1+number2;
       f+="_"+sum;
       number1=number2;
       number2=sum;

   }

        System.out.println(f);


    }


}
