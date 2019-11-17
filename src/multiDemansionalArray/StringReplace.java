package multiDemansionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        String[][] arr = new String[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.next();
            }
        }

//        String [] []arr={{"a","d","2","4"},{"1","2","3","4"}, {"2","1","q","0"}};
        for(int i=0; i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 == 0) {
//                    arrNew[i][j] = "0";
//                } else if (j % 2 == 1) {
//                    arrNew[i][j] = "1";
//                }
//            }
                    arr[i][j].replace(arr[i][j], "0");
                } else if (j % 2 == 1) {
                    arr[i][j].replace(arr[i][j], "1");
                }
            }
        }
        System.out.println( Arrays.deepToString(arr) ) ;
    }

}

