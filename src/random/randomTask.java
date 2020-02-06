package random;

import java.util.Random;

public class randomTask {


    public static void main(String [] args ){
//
//        Random random=new Random();
//      int number=random.nextInt(10);
//      System.out.println( number);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String fullalphabet = alphabet + alphabet.toLowerCase() + "123456789";
        Random random = new Random();

        char code = fullalphabet.charAt(random.nextInt(9));
        System.out.println();





    }
}
