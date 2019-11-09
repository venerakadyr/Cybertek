package methods;

import java.util.Arrays;

public class OverLoading {
    public static void main(String [] args){

        jump();
        jump("puma");
        jump(10);
        String [] arr={"d"};
        System.out.println(jump(arr));


    }

       public static void jump(){
           System.out.println("You dont get far");
       }

       public static void jump(String shoe){
           System.out.println("This shoe made you go farther");
       }



       public static void jump(int distance){
           System.out.println("You jumped "+ distance);
       }
       public static String jump(String [] arr){
        return "jumping by array";


    }



    }

