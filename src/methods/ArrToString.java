package methods;

public class ArrToString {
    public static void main(String[] args) {

//  Write a method that accepts an int array.
//Print out the array using the same format as Arrays.toString method.
// DO NOT USE THE toString() METHOD.
//[element, element, element]

    }
    public static void arraysToString(int[] arr){
        String result="[";
         for (int num: arr){
             result+=num +",";
         }
       result=result.substring(0,result.length()-2)+ "]";
        System.out.println(result);
//        output: [10,9,5,4,3,7,4]
    }
}
