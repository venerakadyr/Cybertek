package methods;

public class voidMethods {
    public static void main(String [] args ){
    sayHi();

    }

    public static void sayHi(){
        for(int i=0; i<5; i++){
//            use for loop to print the method several time once
            System.out.println("HI");
        }
        sayBye();

//        you can create a methods that will you several time and call it later in the main method as needed.
//        It can include everything.
    }
//     creating a new methods make sure you exit first method. Pay Attention to {}
    public static void sayBye(){
        System.out.println("Bye");
    }
}
