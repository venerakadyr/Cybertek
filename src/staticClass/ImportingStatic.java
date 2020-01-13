package staticClass;

import java.util.Arrays;

import static java.util.Arrays.*;

public class ImportingStatic {
    public static void main(String[] args) {


        int []a={1,3,4,5,6,7};
      sort(a);
//      import static java.util.Arrays.*; lets us use all static methods from Array, NOT SHOWING NAME ARRAYS ///EX ARRAYS.SORT()=====SORT()
        System.out.println(Arrays.toString(a));




    }
}
