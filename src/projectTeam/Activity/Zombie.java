package projectTeam.Activity;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();

            int day = 0;
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));//[3, 6, 0, 4, 3, 2, 7, 1]
            while (inhabitants[0] != 0 || inhabitants[1] != 0 || inhabitants[2] != 0 || inhabitants[3] != 0 || inhabitants[4] != 0 || inhabitants[5] != 0 || inhabitants[6] != 0 || inhabitants[7] != 0) {
                for (int k = 0; k < inhabitants.length; k++) {
                    inhabitants[k] = inhabitants[k] / 2;
                }
                day++;
                System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            }
            System.out.println("---- EXTINCT ----");

        }
    }
}
