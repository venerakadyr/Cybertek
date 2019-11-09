package homeTask;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays55Has {
    public static void main(String[] args) {
//        Given an array of ints, print true if the array contains a 5 next to a 5 anywhere in the array.
//        If no consecutive 5s or no 5s are detected in your code then print false.
        Scanner input = new Scanner(System.in);
        int[] numbers = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
//boolean check=false;

    int count=0;
    for(int i=0; i<numbers.length;i++){
        if(numbers[i] == 5 && numbers[i-1]==5) {
            count++;
//            check=true;
        }

    }
//    if(check=true)
    if(count==1){
            System.out.println(Arrays.toString(numbers)+ " True");
        }
        else{

            System.out.println(Arrays.toString(numbers)+ "False");}

        }





    }

