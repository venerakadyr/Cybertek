package multiDemansionalArray;

import java.util.Arrays;

public class replIt {
    public static void main(String[] args) {
//        MULTIPLICATION TABLE
        int[][] multiplicationTable = new int[10][10];


        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 1; j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);

            }
        }
        System.out.println(Arrays.deepToString(multiplicationTable));

    }
//        ==============================================================================
// Scanner inp = new Scanner(System.in);
//        int rows = inp.nextInt(), cols = inp.nextInt();
//        int[][] arr = new int[rows][cols];
//        for(int i=0 ;i<=rows-1;i++)
//        {
//            for(int j=0 ;j<=cols-1;j++)
//            {
//                arr[i][j]=inp.nextInt();
//            }//end for cols
//        }
//
////        int [][] arr={{2,2,3,4,5},{3,4,5,6,6},{3,3,4,6}};
//
//        int matches = 0;
//for(int i=0; i<arr.length;i++){
//    for(int j=1; j<arr[i].length;j++){
//      if(arr[i][j]==arr[i][j-1]){
//          matches++;
//      }
////        int matches = 0;
////        for(int i=0; i<arr.length;i++){
////            for(int j=0; j<arr[i].length;j++){
////                for(int k=0;k<arr[i].length;k++){
////                    if(arr[i][j]==k){
////                }
////            }
////
////                    matches++;

}