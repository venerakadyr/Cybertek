package methods;

import java.util.Arrays;

public class ChangeNegativeNum {
    public static void main(String[] args) {
//    TASK2 Write a method accepts an int array and a number.
////    Replace any negative numbers in your array with the given number. Print the array
//           SECOND PART
        int[] num = {-8, -9, -8, 9,10,-6};
        changeNegNum(num, 0);


    }
//    FIRST PART
    public static void changeNegNum(int[] number,int change) {

        for (int i=0;i <number.length;i++) {
            if (number[i] < 0) {
                number[i]=change;
            }
        }
        System.out.println(Arrays.toString(number));
    }




}
