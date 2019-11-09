package methods;

import java.util.Arrays;

public class AddToEachOther {
    public static void main(String[] args) {


        addNumToString("984323", 1);
    }

//Write a method that will take a String of numbers (9843263 for example) and an int.
// Add that second given number to each other number and show each operation result as separate elements of an int array



public static void addNumToString(String str, int add){
        String [] number= str.split("");
        int [] intArray=new int[number.length];
//         number.length carries  seven empty spaces  "9843263"

        for(int i=0; i<number.length;i++) {
          intArray[i] =Integer.valueOf(number[i])+add;

        }
    System.out.println(Arrays.toString(intArray));

//output [10, 9, 5, 4, 3, 4]
}





}
