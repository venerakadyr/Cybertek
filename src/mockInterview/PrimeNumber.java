package mockInterview;

import java.util.ArrayList;

public class PrimeNumber {
//    static int num;
//    String name;
//
//    {
//        num=0;
//        this.name="venera";
//    }
//




    public static boolean  isPrime(int number) {


        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }


    public static ArrayList<Integer> isPrimeNumber(int number){
        ArrayList<Integer> primeNumber= new ArrayList<>();
        for(int i=1;i<=number;i++){
           if( isPrime(i)==true) {
               primeNumber.add(i);
           }
        }
        return primeNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(50));
    }


}
