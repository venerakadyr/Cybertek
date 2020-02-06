package mockInterview;

import java.util.ArrayList;
public class SecondMaxNum {
    public static int secondMaxNumber(int ... arr) {
        int max = arr[0];
        int second = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
            }
            if (arr[i] > second && arr[i] < max) {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int [] arr={10,45,67,67,89,89,90,90,45,10};
        System.out.println( secondMaxNumber(arr));
    }
    }

