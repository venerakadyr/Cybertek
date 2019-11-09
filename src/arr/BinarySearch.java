package arr;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {



        int[] nums={2,5,0,7,14};
        System.out.println("Index is 2 "+Arrays.binarySearch(nums,2));
        System.out.println("index is 7 " +Arrays.binarySearch(nums,7));
        System.out.println("index is 9" +Arrays.binarySearch(nums,9));
        System.out.println("index of 1"+ Arrays.binarySearch(nums,1));

        System.out.println("index of 0 "+Arrays.binarySearch(nums, 0));









    }
}
