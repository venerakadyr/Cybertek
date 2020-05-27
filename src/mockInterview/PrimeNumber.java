package mockInterview;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class PrimeNumber {



    public static boolean isPrime(int number) {


        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }


    public static ArrayList<Integer> isPrimeNumber(int number) {


        ArrayList<Integer> primeNumber = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (isPrime(i) == true) {
                primeNumber.add(i);
            }
        }
        return primeNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(29));

//        int num = 11;
//        boolean isPrime= false;
//        for(int i = 2; i <= num; ++i)
//        {
//            // condition for nonprime number
//            if(num % i == 0)
//            {
//                isPrime = true;
//                break;
//            }
//        }
//
//        if (!isPrime)
//            System.out.println(num + " is a prime number.");
//        else
//            System.out.println(num + " is not a prime number.");
//    }
    }
}


