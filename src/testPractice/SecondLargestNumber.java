package testPractice;


import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int [] arr= {1, 6, 5, 4};
//        Arrays.sort(arr);
//
//        int size=arr.length;
//        int secondLargest=arr[size-2];
//
//        System.out.println(secondLargest);
//
        int max=arr[0];
        int secondMax=arr[0];

        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
// if the largest number will be first index do if else statement will not work.
            // we need to keep looking
            if(arr[i]>secondMax&&arr[i]<max){
                secondMax=arr[i];
            }

        }

        System.out.println(max);
        System.out.println(secondMax);




    }



    }

