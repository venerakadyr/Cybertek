package inheritance;

public class Huskey extends Animal {
    public Huskey(String name,int age){
        super(name);
        super.age=age;

    }
    public static void main(String[] args) {
        Huskey h1=new Huskey("name",12);
        System.out.println(h1.name+h1.age);



    }


}
