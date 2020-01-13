package wrapperClases;



import java.util.ArrayList;
import java.util.Random;

public class MagicNumber {
//    TASK:
//Create a class MagicNumber
//Instance variable list of integers.
//create a method generateNumbers. This method should accept integer for size and
// it needs to generate given size random numbers and store in list of integers.
    ArrayList<Integer> numbers=new ArrayList<>();
      public void generateNumber(int size){
          Random random=new Random();
          for(int i=0;i<size;i++) {
             numbers.add(random.nextInt(1000)+1);
//              int num=random.nextInt(1000)+1;
//              numbers.add(num);
          }

      }

}
