package inheritancePart2;

public class MacBook extends Laptop {
    public void apple(){
        super.color="grey";

        }

//    public static void s(){
//        System.out.println("static mmmmethod in Laptop");
//    }

  @Override
    protected void turnOn(){
        System.out.println("Laptophvffkuyf is turning on");
    }


    public static void main(String[] args) {
   MacBook mac=new MacBook();
   mac.turnOn();
  Laptop.s();

    }

}
