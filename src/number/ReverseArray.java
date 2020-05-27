package number;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

//     int [] arr={4,7,23,8,8,0,12,45,3,5,4,8,6,56,3,23};
//
//     int temp=0;
//
//     for(int i=0; i<arr.length/2;i++){
//          temp=arr[i];
//          arr[i]=arr[arr.length-1-i];
//          arr[arr.length-1-i]=temp;
//     }
//        System.out.println(Arrays.toString(arr));
//


        int[] arr3 = {5, 2, 8, 4, 0, 4, 78, 1, 34, 56, 78, 23, 6};

        int temp = 0;

        for (int i = 0; i < arr3.length / 2; i++) {
            temp = arr3[i];
            arr3[i] = arr3[arr3.length - 1 - i];
            arr3[arr3.length - 1 - i] = temp;
//            [arr3.length-1 -i] "-i" is dicrementing by one

        }
        System.out.println(Arrays.toString(arr3));


//
//        String name="venera";
//        String [] newname=name.split("");
//        System.out.println(Arrays.toString(newname));
//      String temp=" ";
//        for(int i=0; i<newname.length/2;i++){
//            temp =newname[i];
//            newname[i]= newname[newname.length-1-i];
//            newname[newname.length-1-i]=temp;
//        }
//        System.out.println(Arrays.toString(newname));

    }
 }















