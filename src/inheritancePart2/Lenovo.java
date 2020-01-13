package inheritancePart2;

public class Lenovo extends Laptop {
    public static int numOfLaptops;

    static {

        numOfLaptops=9;
    }


    public Lenovo(){
        super.model="b";
    }
    @Override
    public void turnOn(){
        System.out.println(super.model+ " is turning on");
    }


    public static void testLenovo(){

        System.out.println(numOfLaptops);



    }


    public static void main(String[] args) {
  testLenovo();
    }
}
