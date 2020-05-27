package number;

import java.util.Arrays;

public class BiggestTwoNumSort {
    public static void main(String[] args) {

//Given an array of values: 23, 1, 34, 3, 54, 54, 51
//Print the biggest two values. Only Unique values
//> The result here should be:
//54
//51




        int [] arr={23, 1, 34, 3, 54, 54, 51};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String check="";
        int count=0;
        for (int i=arr.length-1;i>=0;i--) {
            if (count == 2) {
                break;
//if count statement is to print only 2 numbers. it wont let print whole numbers,
            }
            if (check.contains(arr[i] + ""));
            System.out.println(arr[i]);
            check+=arr[i]+"";
            count++;

        }


    }
}
