package methods;

public class FiftyHelloVoid {
    public static void main(String [] args){
   sayHello();
    oddNum();
    }

    public static void sayHello(){
        for(int i=1; i<=50;i++){
            System.out.println("hello" + (i));
        }

    }


    public static void oddNum() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

    }

}
