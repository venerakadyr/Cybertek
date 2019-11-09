package methods;

import java.util.Arrays;

public class EvenNumbersReturn {
//    Create a method that will count how many even numbers there is from the given array and return the value

    public static int evenNum(int [] numbers){

        int  count=0;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]%2==0) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(evenNum(arr));
    }




}
