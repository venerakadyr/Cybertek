package polymorphism3;

public class Dog extends Animal {

String name;



    public Dog(String name) {
        this.name=name;
        System.out.println("DOg class constractor");

    }

    public Dog() {

    }

//    public Dog() {
//
//    }


    public void eat(){
        System.out.println("dog is eating");
    }
    public static void m1(){
        System.out.println("dog");
    }
    public void sleep(){
        System.out.println("dog sleep");
    }
}
