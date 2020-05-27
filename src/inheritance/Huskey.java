package inheritance;

public class Huskey extends Animal {

    static int age=3;
    public Huskey(){

        }



    public static void sleep() {
        System.out.println("Huskey is sleeping ");
    }

    @Override
    public void eat() {
        super.eat();
    }

    public static void main(String[] args) {


        Huskey h1=new Huskey();
        System.out.println(h1.age);





    }


}
