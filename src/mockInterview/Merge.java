package mockInterview;

import java.util.Arrays;

public class Merge {
    //    When gears merge and work together, one teeth from each one goes in order.
//Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:
//
//s1 ==> "12345"
//s2 ==> "abcde"
//mergeStrings(s1,s2) ==> "1a2b3c4d5e"
//
//mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
//
//mergeStrings("java", "selenium") ==> "jsaevlaenium"
    public static String mergeStrings(String one, String two) {
        String store="";
        for(int i=0; i<one.length()|i<two.length();i++){
            if(i<one.length()){
                store+=one.charAt(i)+"";
            }
            if(i<two.length()){
                store+=two.charAt(i)+"";
            }
        }return store;
    }

    //    public static void main(String[] args) {
//        String s1 = "wooden";
//        String s2 = "spoon";
//        System.out.println(  mergeStrings(s1,s2));
//=========================================================================================================
//mergR merges two arrays into one.
//it gets two int arrays and returns an int array
//
//for example:
//
//mergR([1,2,3],[4,5,6])
//returns [1,2,3,4,5,6]
//
//mergR([1,2],[6,8])
//returns [1,2,6,8]
//
//hint:
//create a length int for the combined length of both arrays.
//create an array with that length (thats the array we will return).
//create an iterator for both arrays (int z=0).
//
//loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
//then increment the iterator for both arrays (z++).
//
//do the same for the second array.
    public static int [] mergeR(int []a, int [] b){
        int []arr= new int[a.length+b.length];
        for(int i=0; i<a.length;i++){
            arr[i]+=a[i];
        }
        for(int i=0; i<b.length;i++){
//         arr[arr.length-1-i]=b[b.length-1-i];
//        arr goes to last index start from there decrementing by 1, b goes to last index and merging by one and decrementing.

            arr[a.length+i]=b[0+i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int [] b={0,9,8,7,6};
        System.out.println(Arrays.toString(mergeR(a,b)));
    }
}




