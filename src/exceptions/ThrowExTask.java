package exceptions;

public class ThrowExTask {
    public static void main(String[] args) {
        DogThrowEx dog=new DogThrowEx();
         dog.setAge(4);
        System.out.println(dog.age);
    }
}
