package methods;

import java.util.Arrays;

public class ArrAddReturnOverload {
//Old tasks: ======Create a method that will take a String array and a String. Increase your array capacity and add the given
// String as the last element of the new array. Return the new array


//New task: ===== Overload the pervious method to take a String array, a String to add to the array,
// and number position where the new element should be added


    public static void main(String[] args) {
        String[] arr2 = {"a", "e", "o", "u"};
        System.out.println(Arrays.toString(increaseArray(arr2,"f",4)));


    }

    // Task first
    public static String[] increaseArray(String[] arr, String str) {
        String[] newArr = new String[arr.length + 1];
//        +1 because we adding one later
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = str;
        return newArr;


    }

    //    Task second
    public static String[] increaseArray(String[] arr, String str, int position) {
        String[] newArr = new String[arr.length + 1];
        for (int i = 0, j = 0; j < newArr.length; j++) {
            if (position == j) {
//
                newArr[j] = str;
            } else {
                newArr[j] = arr[i];
                i++;

            }
        }return newArr;
    }
//    Second option
//    public static String [] increaseArray(String [] arr, String str){
//        String [] newArr = Arrays.copyOf(arr, arr.length+1);
//        newArr[newArr.length-1] = str;
//        return newArr;
//
//    }


    }


