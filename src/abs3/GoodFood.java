package abs3;

public interface GoodFood {
     public static final int age=8;

     //1 have a body
   default void eatFood(){
       System.out.println("hgfhdg");

    }

    //2 no body
     public abstract void sleep();


    //3 can have body
    static void eat(){}
}
