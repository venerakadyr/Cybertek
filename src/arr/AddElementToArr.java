package arr;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArr {
    public static void main(String[] args) {
//   add_to_r is a method that gets an array and a number.
//
//the method creates a new array bigger by one then (int[] r).
//It populates the new array with the old ones(r) values.
//and finally in the last position adds the number (int n) to it.
//
//for example:
//
//method input: add_to_r(new int{1,5,77,8}  ,2)
//
//outputs (int array):
//[1, 5, 77, 8, 2]
//        Scanner inp = new Scanner(System.in);
//        int size = inp.nextInt(), n = inp.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i <= size - 1; i++) {
//
//            arr[i] = inp.nextInt();
//        }
//
//        add_to_r(arr, n);
//
//    }
//
//    public static void add_to_r(int[] r, int n) {
////        int[] new_r= new int[r.length+1];
////
////         for(int i=0; i<new_r.length;i++){
////
////                 new_r[i]=r[i];
////                 new_r[new_r.length-1]=n;
////             }
////        System.out.println(Arrays.toString(new_r));
////         }
//        int[] new_r = Arrays.copyOf(r, r.length + 1);
//
//        for (int i = 0; i < new_r.length; i++) {
//
//            if (i == new_r.length - 1) {
//                new_r[i] += n;
//            }
//        }
//        System.out.println(Arrays.toString(new_r));
        String[] r = {"1", "1", "1", "2", "2", "3","0"};
        System.out.println(getDup(r));
    }

    public static int getDup(String[] r) {
        String helper = " ";
        int total = 0;
        for (int i = 0; i < r.length; i++) {
            int count = 0;
            if (!helper.contains(r[i])) {
                for (int j = 0; j <r.length; j++) {
                    if (r[i].equals(r[j])) {
                        count++;

                    }
                    helper += r[i];
                }
                if (count > 1){
                    total+= count;

                }
            }

        }
        return total;

    }


}



