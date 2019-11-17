package multiDemansionalArray;

import java.util.Random;

public class RandomArrMethod {

    public static int [] [] createRandom2DArray(int numOfArrays, int numOfElements){
//        Create a method that will generate a random 2D int array. Take two parameters.
//        The first one for how many 1D arrays you want, and second how many elements each 1D array should have

        int [] []arr=new int [numOfArrays][numOfElements];
        Random random=new Random();
        for(int i=0;i<arr.length; i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=random.nextInt(100);
            }
        }
        return arr;
    }

    public static void main(String[] args) {

    }




}
