package wednesdayClass;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
//         String [] luxCrs={"Mercedes", "BMW","Toyota","Ferrari"};
//
//         for(String car: luxCrs){
//             if(car.equalsIgnoreCase("mercedes")){
//                 System.out.println(car+": Luxury-Comfort");
//             }else if(car.equalsIgnoreCase("bmw")){
//                 System.out.println(car+": Luxury-Sport");
//             }else if(car.equalsIgnoreCase("toyota")){
//                 System.out.println(car+": Reliable-cheap");
//
//             }else if(car.equalsIgnoreCase("ferrari")){
//                 System.out.println(car+":Super car");
//             }}


//========================================== SORT EXAMPLE

// Create
//        String [] shows={"Game of Throne", "Friend", "Prison", "Doctor Who", "Grey Anatomy"};
//        Arrays.sort(shows);
//        for (int i=0; i<shows.length;i++){
//            System.out.println("#"+(i+1)+ " "+ shows[i] );
//        }

//
//        int[] grades = {15, 2, 6, 7, 4, 56, 87, 45, 2, 3, 500, 1};
////     Arrays.sort(grades);
//
//        int max = grades[0];
//        int min = grades[0];
//        for (int i = 0; i < grades.length; i++) {
//            if (max < grades[i]) {
//                max = grades[i];
//            }
//
//
//            if (min > grades[i]) {
//                min = grades[i];
//            }
//        }
//
//        System.out.println("Max:"+max);
//        System.out.println("Min:"+min);
//
//=============================================================== BINARY SEARCH

//        String [] groceryList={"apple","carrot","orange","cherry","strawberry"};
//        Arrays.sort(groceryList);
//        int indexO=Arrays.binarySearch(groceryList,"orange");
//        int indexA=Arrays.binarySearch(groceryList,"apple");
//        System.out.println("Index of apple : "+indexA);
//        System.out.println("Index of orange: "+indexO);
//============================================DIVIDE MY ARRAY=======
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a size of array");
//        int[] numbers = new int[input.nextInt()];
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Enter a element");
//            numbers[i] = input.nextInt();
//            input.nextLine();
//
//        }
//        System.out.println("Starting value of your Array" + Arrays.toString(numbers));
//
//        int [] part1 = Arrays.copyOfRange(numbers, 0, numbers.length/2);
//        int [] part2 = Arrays.copyOfRange(numbers, numbers.length/2, numbers.length);
//        System.out.println("The first half of your array is: " + Arrays.toString(part1));
//        System.out.println("The second half of your array is: " + Arrays.toString(part2));
//    }
//        }


      String word="We went to picnic today";
      String [] rev =word.split(" ");
      String reverse="";
       for(String vvv: rev){
           for(int j=vvv.length()-1; j<0;--j){
               reverse+=vvv.charAt(j);
               System.out.println(reverse);
           }

       }




    }
}

