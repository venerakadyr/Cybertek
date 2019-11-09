package loops;

import java.util.Random;

public class NestedRandom {
    public static void main(String [] args){





        Random random=new Random();
     String number="";
//    string varialble to store the number


        for (int i=0; i<6; i++){

             int ranNum=random.nextInt(10);

             while(number.contains(ranNum+"")){
                 System.out.println(ranNum);
                 ranNum=random.nextInt(10);

             } number+=ranNum;


        } System.out.println(number);



    }
}
