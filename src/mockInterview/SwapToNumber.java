package mockInterview;

import java.util.Scanner;

public class SwapToNumber {
    public static void main(String[] args) {
        int a = 10; //30
        int b = 30;//10


        a = a + b; //40
        b = a - b;
        a = a - b;

        a = a + b;
//        a=10+30; a=40;
        b = a - b;
//        40-30; b=10;
        a = a - b;
//        40-10;  a=30;


    }}

