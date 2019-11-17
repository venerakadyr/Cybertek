package methods;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }

    // Create a method here and call it "plus_minus"

    public static void plus_minus(int [] numbers){
        int positive=0;
        int negative=0;
        int zero=0;
        for(int number:numbers){

            if(number>0){
                positive++;



            }else if(number<0){
                negative++;

            }else{
                zero++;

            }

        } System.out.println("positive: "+positive);
        System.out.println("negative: "+ negative );

        System.out.println("zero: "+ zero);
    }


}

