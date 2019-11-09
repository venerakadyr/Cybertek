package projectTeam.Activity;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();


        }
        System.out.println(Arrays.toString(inhabitants));
       int sum=0;
            do {
                sum=0;
                for(int k=0; k<inhabitants.length; k++){
                inhabitants[k]=inhabitants[k]/=2;
                sum++;

                System.out.println(Arrays.toString(inhabitants));
                }
            }while(sum==0);

        }

    }

