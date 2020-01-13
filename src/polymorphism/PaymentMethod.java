package polymorphism;

public class PaymentMethod implements MobileVerifiable {
    public void charge( double amount){
        System.out.println("You charged"+ amount);

    }

    public void refund(double amount){
        System.out.println("Your refund"+amount);
    }

    @Override
    public boolean verify() {

        return false;
    }
}
