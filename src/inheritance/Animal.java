package inheritance;

import encapsulation.Application;

public class Animal {

     String name;
     static int age=20;
      String breed;



    public Animal(){


    }

    public void eat(){
        System.out.println("Animal is eating");
    }


    public static void sleep(){
        System.out.println("Animal is sleeping");
    }
}
