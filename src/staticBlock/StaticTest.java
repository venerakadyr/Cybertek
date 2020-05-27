package staticBlock;

import java.util.jar.JarOutputStream;

public class StaticTest {
     static int number;
     static{
         System.out.println("Static Hello");
       number=6;

     }

     public StaticTest() {
         System.out.println("Constractor hello");

     }

   static {
         number=10;
       System.out.println("Static Hello 2");
   }

    static void testSt(){
        System.out.println(number);
    }


}
