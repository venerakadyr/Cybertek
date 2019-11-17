package classes;

import java.util.function.DoubleToIntFunction;

public class Flag {
    String country;
    int size;
    String color;
    String material;
    public void flag(){
        System.out.println("Flag is flapping");
    }

//    public static void main(String[] args) {
//        Flag f1=new Flag();
//        f1.material="polyester";
//        f1.size=5;
//        f1.color="red/white";
//        f1.country="US";
//        System.out.println(f1);
//        f1.info();
//        f1.upgrade();
//       created void method INFO
//
//
//        System.out.println();




    public void info(){
        System.out.println("Country: "+country);
        System.out.println("Size:"+ size);
        System.out.println("Color: "+color);
        System.out.println("Materila: "+material);
    }
    public void upgrade(int size, String material){
        this.size=size;
        this.material=material;
    }

}
