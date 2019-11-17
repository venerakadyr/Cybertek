package methods;

public class BiggestNumMultiArray {
    public static int  biggestNumberFrom2DArray(int  [] [] numbers){
//        Create a method that takes a 2D array and return the index of the inner array which has the biggest sum of its elements

        int max=0;
        for(int [] inner: numbers){
            for(int element: inner){
                if(max<element){
                    max=element;
                }
            }
        } return max;
    }

    public static void main(String[] args) {
        int [][] numbers={{3,5,2,342,4,23},{43,32,4032,32,43},{43,43000,23,23}};
        System.out.println(biggestNumberFrom2DArray(numbers));
    }
}
