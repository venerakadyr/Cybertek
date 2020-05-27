package testPractice;

import java.util.Arrays;

public class Smallest_And_Biggest_Number {
    public static void main(String[] args) {
        //given an array of numbers, find and print the smallest and the biggest numbers

//TASK1
//        int [] numbers={-222,8,5,-4,888,-999};
//        PrintSmallestAndBiggestNumsinArray.smallestAndBiggestNumber(numbers);


     int [] floor={0,0,0,0,0,0,};
     for(int i=0; i<floor.length;i++){
         floor[i]=i+1;
     }
        System.out.println(Arrays.toString(floor));
    }



    public static  void smallestAndBiggestNumber(int [] number){
         int smallest= number[0];
         int biggest=number[0];
//         int biggest=Integer.MAX_VALUE;
//         int smallest=Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if (smallest < number[i]) {
                biggest=number[i];

            }

            if (smallest>number[i]){
                smallest=number[i];

            }

            }
        System.out.println("smallest: "+smallest);
        System.out.println("biggerst: "+biggest);

        }








         public  static int[]  sortArray(int[] number) {

             for (int i = 0; i < number.length; i++) {
                 for (int j = i + 1; j < number.length; j++) {
                     int tmp = 0;
                     if (number[i] > number[j]) {
                         tmp = number[i];
                         number[i] = number[j];
                         number[j] = tmp;
                     }
                 }
             }
             return number;


         }

         public static void nonDuplicate( int[] number){
        sortArray(number);

        int nonDuplicateNumber=0;
          for(int i=0; i<number.length;i++){
             if(i==number.length-1&&number.length-1!=number.length-2){
                 nonDuplicateNumber=number.length-1;

             }
                  }

              }

          }







