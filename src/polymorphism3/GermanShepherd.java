package polymorphism3;

public class GermanShepherd extends Dog implements Trainable{



    public GermanShepherd(int age){
        super();
        System.out.println("German constacrt");


    }


    public void go(){
        System.out.println("GS is walking");

    }
    public static void m1(){
        System.out.println("Ger");
    }
    public void sleep(){
        System.out.println("German sleep");
    }



}
